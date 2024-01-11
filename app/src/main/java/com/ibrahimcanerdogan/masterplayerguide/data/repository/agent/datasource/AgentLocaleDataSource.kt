package com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasource

import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.AgentData
import com.ibrahimcanerdogan.masterplayerguide.util.Resource

interface AgentLocaleDataSource {

    suspend fun saveAgentDataToLocal(agentList: List<AgentData>)

    suspend fun getAgentDataFromLocal() : Resource<List<AgentData>>
}