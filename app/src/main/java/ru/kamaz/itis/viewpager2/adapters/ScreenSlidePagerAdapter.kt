package ru.kamaz.itis.viewpager2.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import ru.kamaz.itis.viewpager2.fragment.AllMusicListFragment
import ru.kamaz.itis.viewpager2.fragment.ListMusicFragment
import ru.kamaz.itis.viewpager2.fragment.MusicFragment

class ScreenSlidePagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    var fragments: ArrayList<Fragment> = arrayListOf(
        MusicFragment(),
        AllMusicListFragment()
    )

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}
