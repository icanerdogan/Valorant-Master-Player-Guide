package com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasourceImpl

import com.ibrahimcanerdogan.masterplayerguide.data.database.agent.AgentDao
import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.AgentData
import com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasource.AgentLocaleDataSource
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import javax.inject.Inject

class AgentLocalDataSourceImpl @Inject constructor(
    private val agentDao: AgentDao
) : AgentLocaleDataSource {

    override suspend fun saveAgentDataToLocal(agentList: List<AgentData>) {
        return agentDao.saveAgentDatabase(agentList)
    }

    override suspend fun getAgentDataFromLocal(): Resource<List<AgentData>> {
        return Resource.Success(agentDao.getAgentListDatabase())
    }
}