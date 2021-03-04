package ru.kamaz.itis.viewpager2.helper

class MusicHelper {
    var mName: String
    var mIndex: Int
    var mLevel: Int
    var mLName: Array<MusicName?>? = null
    var mLength = 0
    var mCLength = 0
    var mCNext: MusicHelper? = null
    var mBNext: MusicHelper? = null
    var mPrev: MusicHelper? = null

    constructor(name: String, index: Int, level: Int) {
        mName = name
        mIndex = index
        mLevel = level
    }

    constructor(name: String, index: Int, level: Int, prev: MusicHelper?) {
        mName = name
        mIndex = index
        mLevel = level
        mPrev = prev
    }

    fun clearMusicHelper() {
        for (i in 0 until mCLength) {
            mLName!![i] = null
        }
        mCLength = 0
        mLName = null
        mLength = 0
        if (mCNext != null) {
            mCNext!!.clearMusicHelper()
            mCNext = null
        }
        if (mBNext != null) {
            mBNext!!.clearMusicHelper()
            mBNext = null
        }
    }

    fun setLength(length: Int) {
        if (mLength != length) {
            clearMusicHelper()
            if (length > 0) {
                mLName = arrayOfNulls<MusicName>(length)
                mLength = length
            }
        }
    }

    fun setNext(next: MusicHelper) {
        if (mCNext !== next) {
            if (mBNext != null && mBNext !== next) {
                mBNext!!.clearMusicHelper()
                mBNext = null
            }
            mBNext = mCNext
            mCNext = next
        }
    }

    fun getNext(index: Int): MusicHelper? {
        return if (mCNext != null && mCNext!!.mIndex == index) {
            mCNext
        } else if (mBNext != null && mBNext!!.mIndex == index) {
            mBNext
        } else {
            null
        }
    }

    fun add(name: String?, path: String?) {
        if (mCLength < mLength) {
            mLName!![mCLength++] = MusicName(name, path)
        }
    }

    fun add(name: MusicName?) {
        if (mCLength < mLength) {
            mLName!![mCLength++] = name
        }
    }


}