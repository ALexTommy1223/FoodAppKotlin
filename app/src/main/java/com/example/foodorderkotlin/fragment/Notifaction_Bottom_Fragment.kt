package com.example.foodorderkotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodorderkotlin.R
import com.example.foodorderkotlin.adapter.NotificationAdapter
import com.example.foodorderkotlin.databinding.FragmentMenuBootomSheetBinding
import com.example.foodorderkotlin.databinding.FragmentNotifactionBottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class Notifaction_Bottom_Fragment : BottomSheetDialogFragment() {
    private lateinit var binding:FragmentNotifactionBottomBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentNotifactionBottomBinding.inflate(layoutInflater,container,false)
        val notifications= listOf( "Your order has been Canceled Successfully",
            "Another notification message",
            "Yet another notification");
        val notificationImages= listOf(R.drawable.sademoji,
                R.drawable.truck,R.drawable.congrats
            )
        val adapterView=NotificationAdapter(ArrayList(notifications), ArrayList(notificationImages))
        binding.notificationBottomRecylerView.layoutManager=LinearLayoutManager(requireContext())
        binding.notificationBottomRecylerView.adapter=adapterView
        return binding.root
    }

    companion object {

    }
}