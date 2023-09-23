package com.example.foodorderkotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodorderkotlin.R
import com.example.foodorderkotlin.adapter.CartAdapter
import com.example.foodorderkotlin.adapter.MenuAdapter
import com.example.foodorderkotlin.databinding.FragmentMenuBootomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MenuBootomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding:FragmentMenuBootomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMenuBootomSheetBinding.inflate(inflater,container,false)

        binding.buttonBack.setOnClickListener{
            dismiss()
        }
        val menuFoodName= listOf("Burger","sandwitch","momo","item","sandwich","mimo")
        val menuItemPrice= listOf("$5","$9","75","$45","$15","$6")

        val menuImage= listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6,
        )
        val adapter= MenuAdapter(ArrayList(menuFoodName),ArrayList(menuItemPrice),ArrayList(menuImage))
        binding.menuRecylerview.layoutManager= LinearLayoutManager(requireContext())
        binding.menuRecylerview.adapter=adapter


        return binding.root
    }

    companion object {

    }
}