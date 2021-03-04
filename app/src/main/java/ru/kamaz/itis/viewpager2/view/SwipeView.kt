package ru.kamaz.itis.viewpager2.view

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

class SwipeView(context: Context, attrs: AttributeSet?) : ViewPager(context, attrs) {
    companion object {
        const val TOUCH_DISTANCE = 100
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {

        ev?.let {
            val x = ev.x

            if (x >= TOUCH_DISTANCE) return false
        }

        return super.onTouchEvent(ev)
    }
}