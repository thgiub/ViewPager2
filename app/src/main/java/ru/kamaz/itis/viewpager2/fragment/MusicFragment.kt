package ru.kamaz.itis.viewpager2.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.music.presentation.interfaces.MusicInterface
import kotlinx.android.synthetic.main.music_fragment.*
import ru.kamaz.itis.viewpager2.databinding.MusicFragmentBinding
import ru.kamaz.itis.viewpager2.helper.MusicHelper
import ru.kamaz.itis.viewpager2.view.OnSwipeTouchListener
import java.io.BufferedReader


class MusicFragment() : Fragment(), MusicInterface.View {
    private lateinit var presenter: MusicInterface.Presenter
    lateinit var viewPager: ViewPager2

    val bafReader: BufferedReader? =null
    val USBArrayList: ArrayList<MusicHelper>? =null
    private var _binding: MusicFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MusicFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        setListeners()
    }

    override fun init() {


    }





    override fun setListeners() {

        binding.nameSong.setOnTouchListener(object : OnSwipeTouchListener(context!!) {
            override  fun onSwipeLeft() {
                name_song.setText("KUTAK")

            }

            override fun onSwipeRight() {
                name_song.setText("Bash")
            }

        })
        binding.nextButton.setOnClickListener {
            Log.i("TAG", "setListeners:Pisa ")
            Toast.makeText(context, "Абзый", Toast.LENGTH_SHORT).show()

        }
        binding.prevButton.setOnClickListener {

            Toast.makeText(context, "Пошел на хуй", Toast.LENGTH_SHORT).show()

        }
        binding.icPlay.setOnClickListener {
            Toast.makeText(context, "Где нибудь сам бля ", Toast.LENGTH_SHORT).show()


        }
        binding.repeat.setOnClickListener {
            Toast.makeText(context, "Долбоеб ", Toast.LENGTH_SHORT).show()

        }
        binding.rotate.setOnClickListener {
            Toast.makeText(context, "Шутки шутками ", Toast.LENGTH_SHORT).show()

        }
        binding.star.setOnClickListener {
            Toast.makeText(context, "но ты перебарщиваешь ", Toast.LENGTH_SHORT).show()

        }
        binding.folder.setOnClickListener {
            Toast.makeText(context, "Пиздец люблю Рембо ", Toast.LENGTH_SHORT).show()

        }




    }

    override fun addUSB(name: String) {

    }


}


