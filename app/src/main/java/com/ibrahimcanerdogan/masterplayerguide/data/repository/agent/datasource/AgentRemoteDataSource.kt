package com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasource

import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.Agent
import retrofit2.Response

interface AgentRemoteDataSource {

    suspend fun getAgentFromRemote() : Response<Agent>
}