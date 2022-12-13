package com.izzed.ndelokmovie.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.izzed.ndelokmovie.R
import com.izzed.ndelokmovie.data.Movie

class CardViewAdapter(private val listData: ArrayList<Movie>) : RecyclerView.Adapter<CardViewAdapter.CardVIewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardVIewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return CardVIewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardVIewViewHolder, position: Int) {
        val data = listData[position]

        Glide.with(holder.itemView.context)
            .load(data.poster)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPoster)

        holder.tvName.text = data.name
        holder.tvDetail.text = data.detail
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class CardVIewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }
}