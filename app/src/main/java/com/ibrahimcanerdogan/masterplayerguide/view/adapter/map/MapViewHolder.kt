package com.ibrahimcanerdogan.masterplayerguide.view.adapter.map

import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.ibrahimcanerdogan.masterplayerguide.data.model.map.MapData
import com.ibrahimcanerdogan.masterplayerguide.databinding.ItemMapBinding

class MapViewHolder(
    private val binding: ItemMapBinding,
    private val onMapItemClick : ((MapData) -> Unit)?
): RecyclerView.ViewHolder(binding.root){

    fun bind(mapData: MapData) {

        val circularProgress = CircularProgressDrawable(binding.root.context)
        circularProgress.strokeWidth = 5F
        circularProgress.centerRadius = 50F
        circularProgress.start()

        binding.apply {
            Glide.with(root.context)
                .load(mapData.splash)
                .placeholder(circularProgress)
                .into(imageViewListMapIcon)

            textViewListMapName.text = mapData.displayName

            llListMapItem.setOnClickListener {
                onMapItemClick?.invoke(mapData)
            }
        }
    }
}