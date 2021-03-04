package ru.kamaz.itis.viewpager2.activity

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import ru.kamaz.itis.viewpager2.DepthPageTransformer
import ru.kamaz.itis.viewpager2.R
import ru.kamaz.itis.viewpager2.adapters.ScreenSlidePagerAdapter
import ru.kamaz.itis.viewpager2.databinding.ActivityMainBinding
import ru.kamaz.itis.viewpager2.helper.MusicHelper
import java.io.BufferedReader


class MainActivity : FragmentActivity() {
    lateinit var viewPager: ViewPager2

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    fun init() {
        viewPager = binding.pager
        val pagerAdapter =
            ScreenSlidePagerAdapter(
                supportFragmentManager,
                lifecycle
            )
        viewPager.adapter = pagerAdapter
        viewPager.setPageTransformer(DepthPageTransformer())
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}



