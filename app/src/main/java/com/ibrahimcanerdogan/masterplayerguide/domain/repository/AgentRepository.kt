package com.ibrahimcanerdogan.masterplayerguide.domain.repository

import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.AgentData
import com.ibrahimcanerdogan.masterplayerguide.util.Resource

interface AgentRepository {

    suspend fun getAllAgentsFromRepository() : Resource<List<AgentData>>
}