package com.ibrahimcanerdogan.masterplayerguide.data.repository.agent

import android.util.Log
import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.Agent
import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.AgentData
import com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasource.AgentLocaleDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasource.AgentRemoteDataSource
import com.ibrahimcanerdogan.masterplayerguide.domain.repository.AgentRepository
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

class AgentRepositoryImpl @Inject constructor(
    private val remoteDataSource: AgentRemoteDataSource,
    private val localeDataSource: AgentLocaleDataSource
) : AgentRepository {

    override suspend fun getAllAgentsFromRepository(): Resource<List<AgentData>> {
        lateinit var agentData : Resource<List<AgentData>>

        try {
            agentData = localeDataSource.getAgentDataFromLocal()
        } catch (e: Exception) {
            Log.e(TAG, e.message.toString())
        }

        if (!agentData.data.isNullOrEmpty()) {
            return agentData
        } else {
            agentData = responseToResource(remoteDataSource.getAgentFromRemote())
            localeDataSource.saveAgentDataToLocal(agentData.data!!.filter {
                it.agentIsPlayableCharacter
            })
        }

        return agentData
    }

    private fun responseToResource(response : Response<Agent>) : Resource<List<AgentData>> {
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(
                    it.agents.filter { agent ->
                        agent.agentIsPlayableCharacter
                    }
                )
            }
        }
        return Resource.Error(response.message())
    }

    companion object {
        private val TAG = AgentRepositoryImpl::class.java.toString()
    }
}