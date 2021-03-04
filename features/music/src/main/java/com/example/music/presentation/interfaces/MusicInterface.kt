package com.example.music.presentation.interfaces

interface MusicInterface {
    interface View{
        fun init()
        fun setListeners()
        fun addUSB(name:String)
    }
    interface Presenter{
        fun setView()
        fun init()
    }

}