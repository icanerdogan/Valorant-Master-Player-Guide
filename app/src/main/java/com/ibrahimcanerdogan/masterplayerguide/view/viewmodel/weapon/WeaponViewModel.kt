package com.ibrahimcanerdogan.masterplayerguide.view.viewmodel.weapon

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.WeaponData
import com.ibrahimcanerdogan.masterplayerguide.domain.usecase.GetWeaponUseCase
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import com.ibrahimcanerdogan.masterplayerguide.view.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeaponViewModel @Inject constructor(
    app: Application,
    private val getWeaponUseCase: GetWeaponUseCase
) : BaseViewModel(app) {

    private var weaponList = MutableLiveData<Resource<List<WeaponData>>>()
    val weaponListData : LiveData<Resource<List<WeaponData>>>
        get() = weaponList

    private var weaponDetail = MutableLiveData<Resource<WeaponData>>()
    val weaponDetailData : LiveData<Resource<WeaponData>>
        get() = weaponDetail


    fun getAllWeaponData(weaponCategory : String) = viewModelScope.launch(Dispatchers.IO) {
        weaponList.postValue(Resource.Loading())

        try {
            val apiResult = getWeaponUseCase.execute()
            val newList : ArrayList<WeaponData> = arrayListOf()
            for (i in apiResult.data!!.indices) {
                if (apiResult.data[i].weaponCategory.split("::")[1] == weaponCategory) {
                    newList.add(apiResult.data[i])
                }
            }
            weaponList.postValue(Resource.Success(newList))
        } catch (e: Exception) {
            weaponList.postValue(Resource.Error(e.message.toString()))
        }
    }

    fun getDetailWeaponData(uuid : String) = viewModelScope.launch(Dispatchers.IO) {
        weaponDetail.postValue(Resource.Loading())

        try {
            val result = getWeaponUseCase.execute()
            result.data?.forEach {
                if (it.uuid == uuid) {
                    weaponDetail.postValue(Resource.Success(it))
                }
            }
        } catch (e: Exception) {
            weaponDetail.postValue(Resource.Error(e.message.toString()))
        }
    }
}