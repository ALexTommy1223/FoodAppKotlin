package com.example.foodorderkotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodorderkotlin.R
import com.example.foodorderkotlin.adapter.BuyAgainAdapter
import com.example.foodorderkotlin.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {
    private lateinit var binding:FragmentHistoryBinding
    private lateinit var buyAgainAdapter: BuyAgainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHistoryBinding.inflate(layoutInflater,container,false)
        setupRecylerView()
        return binding.root
    }
    private fun setupRecylerView(){
        val buyAgainFoodName= arrayListOf("Food 1","Food 2","Food 3")
        val buyAgainFoodPrice= arrayListOf("$20","$13","$29")
        val buyAgainFoodImage= arrayListOf(R.drawable.menu1,
            R.drawable.menu2,R.drawable.menu3
            )
        buyAgainAdapter= BuyAgainAdapter(buyAgainFoodName,buyAgainFoodPrice,buyAgainFoodImage)
        binding.buyagainRecylerview.layoutManager=LinearLayoutManager(requireContext())
        binding.buyagainRecylerview.adapter=buyAgainAdapter
    }
    companion object {

    }
}