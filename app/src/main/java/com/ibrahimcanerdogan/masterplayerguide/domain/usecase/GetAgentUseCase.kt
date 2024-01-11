package com.ibrahimcanerdogan.masterplayerguide.domain.usecase

import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.AgentData
import com.ibrahimcanerdogan.masterplayerguide.domain.repository.AgentRepository
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import javax.inject.Inject

class GetAgentUseCase @Inject constructor(
    private val agentRepository: AgentRepository
) {

    suspend fun execute() : Resource<List<AgentData>> {
        return agentRepository.getAllAgentsFromRepository()
    }
}