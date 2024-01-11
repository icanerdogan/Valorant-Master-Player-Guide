package com.ibrahimcanerdogan.masterplayerguide.data.model.agent

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "agent_data"
)
data class AgentData(
    @PrimaryKey
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("abilities")
    val agentAbilities: List<AgentAbility>,
    @SerializedName("background")
    val agentBackground: String,
    @SerializedName("backgroundGradientColors")
    val agentBackgroundGradientColors: List<String>?,
    @SerializedName("bustPortrait")
    val agentBustPortrait: String,
    @SerializedName("characterTags")
    val agentCharacterTags: List<String>?,
    @SerializedName("description")
    val agentDescription: String,
    @SerializedName("developerName")
    val agentDeveloperName: String,
    @SerializedName("displayIcon")
    val agentDisplayIcon: String,
    @SerializedName("displayIconSmall")
    val agentDisplayIconSmall: String,
    @SerializedName("displayName")
    val agentDisplayName: String,
    @SerializedName("fullPortrait")
    val agentFullPortrait: String,
    @SerializedName("fullPortraitV2")
    val agentFullPortraitV2: String,
    @SerializedName("isAvailableForTest")
    val agentIsAvailableForTest: Boolean,
    @SerializedName("isBaseContent")
    val agentIsBaseContent: Boolean,
    @SerializedName("isFullPortraitRightFacing")
    val agentIsFullPortraitRightFacing: Boolean,
    @SerializedName("isPlayableCharacter")
    val agentIsPlayableCharacter: Boolean,
    @SerializedName("killfeedPortrait")
    val agentKillFeedPortrait: String,
    @SerializedName("recruitmentData")
    val agentRecruitmentData: AgentRecruitmentData?,
    @SerializedName("role")
    val agentRole: AgentRole?,
)