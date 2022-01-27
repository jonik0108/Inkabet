package com.abbasov.inkabet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.abbasov.inkabet.adapter.Pager1
import com.abbasov.inkabet.databinding.ActivityTwoBinding
import com.abbasov.inkabet.fragment.D
import com.abbasov.inkabet.fragment.E
import com.abbasov.inkabet.fragment.F
import com.eftimoff.viewpagertransformers.CubeOutTransformer

class Two : AppCompatActivity() {
    lateinit var pager1:Pager1
    lateinit var binding:ActivityTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val array=ArrayList<Fragment>()
        array.add(D())
        array.add(E())
        array.add(F())
        pager1=Pager1(array,supportFragmentManager)
        binding.viewpager.adapter=pager1
        binding.viewpager.setPageTransformer(true, CubeOutTransformer())
        binding.tabLayout.setupWithViewPager(binding.viewpager)

    }
}