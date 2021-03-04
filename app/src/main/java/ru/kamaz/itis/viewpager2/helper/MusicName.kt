package ru.kamaz.itis.viewpager2.helper

class MusicName(name: String?, path: String?) {
    var mName: String? = null
    var mPath: String? = null

    fun MusicName(name: String?, path: String?) {
        mName = name
        mPath = path
    }

    fun MusicName(name: MusicName) {
        mName = name.mName
        mPath = name.mPath
    }
}