package com.trkmn.ordergo.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.createBitmap
import com.trkmn.ordergo.R
import com.trkmn.ordergo.databinding.FragmentOrderDetailBinding


class OrderDetailFragment : Fragment() {

    private lateinit var binding: FragmentOrderDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderDetailBinding.inflate(inflater, container, false)
        return binding.root
    }


}