package com.ibrahimcanerdogan.masterplayerguide.view.viewmodel.agent

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.AgentData
import com.ibrahimcanerdogan.masterplayerguide.domain.usecase.GetAgentUseCase
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import com.ibrahimcanerdogan.masterplayerguide.view.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class AgentViewModel @Inject constructor(
    private val app : Application,
    private val getAgentUseCase: GetAgentUseCase
) : BaseViewModel(app) {

    private var agent = MutableLiveData<Resource<List<AgentData>>>()
    val agentData : LiveData<Resource<List<AgentData>>>
        get() = agent

    fun getAllAgentData() = viewModelScope.launch(Dispatchers.IO) {
        agent.postValue(Resource.Loading())

        try {
            val result = getAgentUseCase.execute()
            agent.postValue(result)
        } catch (e : Exception) {
            agent.postValue(Resource.Error(e.message.toString()))
        }
    }

}