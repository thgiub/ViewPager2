package ru.kamaz.itis.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {
    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }
   fun init(){
       viewPager = findViewById(R.id.pager)
       val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager,lifecycle)
       viewPager.adapter = pagerAdapter
       viewPager.setPageTransformer(DepthPageTransformer())
   }


}



