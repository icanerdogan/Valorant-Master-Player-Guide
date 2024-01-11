package com.ibrahimcanerdogan.masterplayerguide.view.viewmodel.agent

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.masterplayerguide.domain.usecase.GetAgentUseCase

class AgentViewModelFactory(
    private val application: Application,
    private val getAgentUseCase: GetAgentUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AgentViewModel(
            application,
            getAgentUseCase
        ) as T
    }
}