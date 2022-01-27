package com.abbasov.inkabet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.abbasov.inkabet.adapter.Pager2
import com.abbasov.inkabet.databinding.ActivityThreeBinding
import com.abbasov.inkabet.fragment.G
import com.abbasov.inkabet.fragment.H
import com.abbasov.inkabet.fragment.M
import com.eftimoff.viewpagertransformers.CubeOutTransformer

class Three : AppCompatActivity() {
    lateinit var binding:ActivityThreeBinding
    lateinit var pager2: Pager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val array=ArrayList<Fragment>()
        array.add(G())
        array.add(H())
        array.add(M())
        pager2=Pager2(array,supportFragmentManager)
        binding.viewpager.adapter=pager2
        binding.viewpager.setPageTransformer(true, CubeOutTransformer())
        binding.tabLayout.setupWithViewPager(binding.viewpager)
    }
}