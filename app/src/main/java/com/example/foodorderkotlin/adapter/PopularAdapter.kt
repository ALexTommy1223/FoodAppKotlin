package com.example.foodorderkotlin.adapter

import android.media.Image
import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderkotlin.databinding.PopularItemsBinding

class PopularAdapter(private val items:List<String>,private val price:List<String>,private val image: List<Int>): RecyclerView.Adapter<PopularAdapter.PopulerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopulerViewHolder {
        return PopulerViewHolder(PopularItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: PopulerViewHolder, position: Int) {
        val item=items[position]
        val images=image[position]
        val price=price[position]
        holder.bind(item,images,price)
    }

    override fun getItemCount(): Int {
        return items.size
    }
    class PopulerViewHolder(private val binding:PopularItemsBinding):RecyclerView.ViewHolder(binding.root) {
        private val imageView=binding.imageView5
        fun bind(item: String, images: Int,price: String) {
            binding.foodNameProduct.text=item
            binding.pricePopular.text=price
            imageView.setImageResource(images)
        }

    }

}