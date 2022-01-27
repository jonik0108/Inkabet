package com.abbasov.inkabet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.abbasov.inkabet.adapter.Pager
import com.abbasov.inkabet.databinding.ActivityOneBinding
import com.abbasov.inkabet.fragment.A
import com.abbasov.inkabet.fragment.B
import com.abbasov.inkabet.fragment.C
import com.eftimoff.viewpagertransformers.CubeOutTransformer

class One : AppCompatActivity() {
    lateinit var pager:Pager
    lateinit var binding: ActivityOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val array=ArrayList<Fragment>()
        array.add(A())
        array.add(B())
        array.add(C())
        pager=Pager(array,supportFragmentManager)
        binding.viewpager.adapter=pager
        binding.viewpager.setPageTransformer(true, CubeOutTransformer())
        binding.tabLayout.setupWithViewPager(binding.viewpager)

    }
}