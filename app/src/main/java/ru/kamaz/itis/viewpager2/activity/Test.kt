package ru.kamaz.itis.viewpager2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.view.MotionEvent
import android.view.View
import ru.kamaz.itis.viewpager2.R

class Test : AppCompatActivity(), View.OnTouchListener {
    var x: Float? = null
    var y: Float? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        x= event?.x
        y= event?.y


        MotionEvent.ACTION_DOWN


        return true

    }
}