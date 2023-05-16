package com.example.pertemuan4

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


class FragmentAdapter (manager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(manager,lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }


    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> FragmentSatu()
            1 -> FragmentDua()
            else -> FragmentSatu()
        }
    }
}