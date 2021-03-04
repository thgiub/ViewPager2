package ru.kamaz.itis.viewpager2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.kamaz.itis.phoneapp.ui.pojo.RecyclerViewItem
import ru.kamaz.itis.phoneapp.ui.pojo.SongItem
import ru.kamaz.itis.viewpager2.databinding.TestItemBinding
import ru.kamaz.itis.viewpager2.databinding.TestTextItemBinding


class AllMusicRvAdapter(private val item: List<RecyclerViewItem>) :
    RecyclerView.Adapter<AllMusicRvAdapter.MyViewHolder>() {

    lateinit var binding: TestItemBinding
    lateinit var binding2: TestTextItemBinding



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding2 = TestTextItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding2)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val element = item[position]
        when(holder){
            is MyViewHolder-> holder.bind(element as SongItem)
        }

    }

    override fun getItemCount() = item.size


    class MyViewHolder(private val binding2: TestTextItemBinding) :
        RecyclerView.ViewHolder(binding2.root), View.OnClickListener {

        fun bind(item: SongItem) {
            binding2.text1.text=item.tvArtistNameList
            binding2.text2.text=item.tvMusicNameList
        }

        override fun onClick(v: View?) {
            when (v) {
                itemView -> {

                }

            }
        }
    }









}