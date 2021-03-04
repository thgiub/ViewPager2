package ru.kamaz.itis.viewpager2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.music.presentation.interfaces.MusicInterface
import ru.kamaz.itis.viewpager2.DepthPageTransformer
import ru.kamaz.itis.viewpager2.R
import ru.kamaz.itis.viewpager2.adapters.ScreenSlidePagerAdapter

class ListMusicFragment : Fragment(),MusicInterface.View {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.music_list_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun init() {


    }

    override fun setListeners() {
        TODO("Not yet implemented")
    }

    override fun addUSB(name: String) {
        TODO("Not yet implemented")
    }
}