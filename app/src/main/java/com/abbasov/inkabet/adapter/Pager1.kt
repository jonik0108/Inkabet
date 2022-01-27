package com.abbasov.inkabet.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.abbasov.inkabet.fragment.D
import com.abbasov.inkabet.fragment.E
import com.abbasov.inkabet.fragment.F

class Pager1 (var list: ArrayList<Fragment>, fragmentManager: FragmentManager)
    : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> D()
            1 -> E()
            2 -> F()
            else -> D()

        }
    }
}