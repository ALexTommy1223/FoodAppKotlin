package com.example.foodorderkotlin.adapter

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.ViewGroup
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderkotlin.databinding.MenuItemsBinding

class MenuAdapter(
    private val menuItems: MutableList<String>,
    private val menuItemPrice: MutableList<String>,
    private val menuItemImage:MutableList<Int> ): RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    inner class MenuViewHolder(private val binding:MenuItemsBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.apply {
                menuFoodName.text=menuItems[position]
                menuPrice.text=menuItemPrice[position]
                menuImage.setImageResource(menuItemImage[position])
            }
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding=MenuItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  MenuViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
       holder.bind(position)
    }

    override fun getItemCount(): Int =menuItems.size
    }
