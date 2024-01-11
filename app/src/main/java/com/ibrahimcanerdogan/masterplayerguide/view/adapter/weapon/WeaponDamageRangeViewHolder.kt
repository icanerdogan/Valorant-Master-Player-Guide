package com.ibrahimcanerdogan.masterplayerguide.view.adapter.weapon

import androidx.recyclerview.widget.RecyclerView
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.stats.StatDamageRange
import com.ibrahimcanerdogan.masterplayerguide.databinding.ItemWeaponDamageRangeBinding

class WeaponDamageRangeViewHolder(
    private val binding: ItemWeaponDamageRangeBinding
) : RecyclerView.ViewHolder(binding.root){

    fun bind(statDamageRange: StatDamageRange) {
        binding.apply {
            textViewWeaponDamageRangeMeter.text = "${statDamageRange.statRangeStartMeters} - ${statDamageRange.statRangeEndMeters} Meters"
            textViewWeaponDetailDamageBody.text = "B: ${statDamageRange.statBodyDamage}"
            textViewWeaponDetailDamageHead.text = "H: ${statDamageRange.statHeadDamage?.toInt()}"
            textViewWeaponDetailDamageLeg.text = "L: ${statDamageRange.statLegDamage?.toInt()}"
        }
    }
}