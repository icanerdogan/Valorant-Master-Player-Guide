package com.ibrahimcanerdogan.masterplayerguide.data.database.agent

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.AgentData

@Dao
interface AgentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveAgentDatabase(agentList : List<AgentData>)

    @Query("SELECT * FROM agent_data")
    fun getAgentListDatabase() : List<AgentData>
}