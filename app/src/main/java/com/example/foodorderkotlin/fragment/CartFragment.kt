package com.example.foodorderkotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodorderkotlin.R
import com.example.foodorderkotlin.adapter.CartAdapter
import com.example.foodorderkotlin.databinding.CartItemsBinding
import com.example.foodorderkotlin.databinding.FragmentCartBinding


class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater, container, false)

        val cartFoodName= listOf("Burger","sandwitch","momo","item","sandwich","mimo")
        val cartItemPrice= listOf("$5","$9","75","$45","$15","$6")

        val cartImage= listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6,
        )
        val adapter= CartAdapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cartRec.layoutManager=LinearLayoutManager(requireContext())
        binding.cartRec.adapter=adapter
        return binding.root
    }

    companion object {

    }
}