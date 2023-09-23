package com.example.foodorderkotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodorderkotlin.R
import com.example.foodorderkotlin.adapter.MenuAdapter
import com.example.foodorderkotlin.databinding.FragmentSearchBinding
import com.google.android.material.search.SearchView

class SearchFragment : Fragment() {
   private lateinit var binding:FragmentSearchBinding
   private lateinit var adapter: MenuAdapter
   private val orignalMenuFoodName= listOf("Burger","sandwitch","momo","item","sandwich","mimo")
    private val orignalMenuItemPrice= listOf("$5","$9","75","$45","$15","$6")

    private val orignalMenuImage= listOf(
        R.drawable.menu1,
        R.drawable.menu2,
        R.drawable.menu3,
        R.drawable.menu4,
        R.drawable.menu5,
        R.drawable.menu6,
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    private val filteredMenuFoodName= mutableListOf<String>()
    private val filteredMenuItemPrice= mutableListOf<String>()
    private val filteredMenuImage= mutableListOf<Int>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentSearchBinding.inflate(inflater,container,false)
        adapter= MenuAdapter(filteredMenuFoodName,filteredMenuItemPrice,filteredMenuImage
        )
        binding.menuRecylerView.layoutManager=LinearLayoutManager(requireContext())
        binding.menuRecylerView.adapter=adapter

        //setup for search View
        setupSearchView()
        showAllMenu()
        return binding.root
    }

    private fun showAllMenu() {
        filteredMenuFoodName.clear()
        filteredMenuItemPrice.clear()
        filteredMenuImage.clear()


        filteredMenuFoodName.addAll(orignalMenuFoodName)
        filteredMenuItemPrice.addAll(orignalMenuItemPrice)
        filteredMenuImage.addAll(orignalMenuImage)

        adapter.notifyDataSetChanged()
    }

    private fun setupSearchView() {
        binding.searchView.setOnQueryTextListener(object :android.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                filterMenuItems(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                filterMenuItems(newText)
                return true
            }

        })
    }

    private fun filterMenuItems(query: String) {
        filteredMenuFoodName.clear()
        filteredMenuItemPrice.clear()
        filteredMenuImage.clear()

        orignalMenuFoodName.forEachIndexed{index, foodName ->
            if(foodName.contains(query.toString(), ignoreCase = true)){
                filteredMenuFoodName.add(foodName)
                filteredMenuItemPrice.add(orignalMenuItemPrice[index])
                filteredMenuImage.add(orignalMenuImage[index])
            }

        }
        adapter.notifyDataSetChanged()
    }

    companion object {

    }
}