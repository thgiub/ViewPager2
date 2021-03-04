package ru.kamaz.itis.viewpager2.fragment

import android.bluetooth.BluetoothAdapter
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.kamaz.itis.phoneapp.ui.pojo.RecyclerViewItem
import ru.kamaz.itis.phoneapp.ui.pojo.SongItem
import ru.kamaz.itis.viewpager2.adapters.AllMusicRvAdapter
import ru.kamaz.itis.viewpager2.databinding.AllMusicFragmentBinding
import ru.kamaz.itis.viewpager2.helper.TwMusic
import java.io.File


class AllMusicListFragment:Fragment() {
    private lateinit var adapter: BluetoothAdapter
    private var _binding: AllMusicFragmentBinding? = null
    private val binding get() = _binding!!

    val listMusic: TwMusic? = null
    val mediaPlayer:MediaPlayer?=null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      _binding=AllMusicFragmentBinding.inflate(inflater, container, false)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        binding.rvAllMusic.setLayoutManager(layoutManager)



        val listItem= mutableListOf<RecyclerViewItem>()

        listItem.addAll(getMusic())

        binding.rvAllMusic.adapter= AllMusicRvAdapter(listItem)

        return binding.root


    }

    fun getMusic(): MutableList<RecyclerViewItem>{
        val fileUSB =
            File("/storage").listFiles { f ->
                val n = f.name
                if (f.canRead() && f.isDirectory && n.startsWith("usb")) {
                    true
                } else false
            }


        if (fileUSB != null) {
            for (f in fileUSB) {
                listMusic?.getPlayList(f.path)
                Log.i("popa", f.path)
            }
        }

        val list = mutableListOf<RecyclerViewItem>()
        val tvMusicNameList = "sdfsd"
        val tvArtistNameList = "sdfsd"
        val item = SongItem(tvMusicNameList,tvArtistNameList)
        list +=item
        return list
    }


}