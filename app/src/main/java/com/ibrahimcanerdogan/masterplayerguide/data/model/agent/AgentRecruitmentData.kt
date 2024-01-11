package com.ibrahimcanerdogan.masterplayerguide.data.model.agent

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class AgentRecruitmentData(
    @PrimaryKey(autoGenerate = true)
    val recruitmentID: Int,
    @SerializedName("counterId")
    val recruitmentCounterId: String,
    @SerializedName("endDate")
    val recruitmentEndDate: String,
    @SerializedName("levelVpCostOverride")
    val recruitmentLevelVpCostOverride: Int,
    @SerializedName("milestoneId")
    val recruitmentMilestoneId: String,
    @SerializedName("milestoneThreshold")
    val recruitmentMilestoneThreshold: Int,
    @SerializedName("startDate")
    val recruitmentStartDate: String,
    @SerializedName("useLevelVpCostOverride")
    val recruitmentUseLevelVpCostOverride: Boolean
)