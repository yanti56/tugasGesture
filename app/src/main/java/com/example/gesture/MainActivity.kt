package com.example.gesture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.GestureDetector
import android.view.KeyEvent
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.view.MotionEventCompat as MotionEventCompatl


class MainActivity() : AppCompatActivity(), GestureDetector.OnContextClickListener,
        GestureDetector.OnDoubleTapListener {

    // variabel untuk mendekteksi Gesture yang diberi nilai awal yaitu null
    val gDetector: GestureDetectorCompat? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    // membuat class turunan GestureDetectorCompat
        this.gDetector = GestureDetectorCompat(this, this)

        // mendekteksi ketukan ganda
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector?.onTouchEvent(event)

        // memastikan untuk menanggil implementasi superclass
        return super.onTouchEvent(event)
    }
 // implementasi untuk ketukan kebawah atau onDown
    override fun onDown(event: MotionEvent): Boolean {
    gesture_status.text = "onDown"
        return true
    }

    // implementasi untuk ketukan melempar atau onFling
    override fun onFling(event1: MotionEvent, enent2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
        gesture_status.text ="onFling"
        return true
    }

  // implementasi untuk lama atau onLongPress
    override fun onLongPress(event: MotionEvent) {
        gesture_status.text = "onLongPress"
  }

    // implementasi untuk melakukan scroll atau onScroll
    override fun onScroll(el: MotionEvent, el2: MotionEvent, distanceX: Float, distanceY: Float) : Boolean {
        gesture_status.text = "onScroll"
        return true
    }

    // implementasi untuk menekan atau onShowPress
    override fun onShowPress(event: MotionEvent){
        gesture_status.text ="onShowPress"
    return true
    }

    // implementasi untuk sekali ketuk atau onSingleTapUp
    override fun onSingleTapUp (event: MotionEvent) : Boolean {
        gesture_status.text = "onSingleTapUp"
    return true
    }
        // implementasi untuk ketukan berulang kali dua kali atau onDoubleTap
    override fun onDoubleTap(e: MotionEvent?): Boolean {
        gesture_status.text ="onDoubleTap"
        return true
    }

    // implementasi untuk ketukan berulang - ulang atau onDoubleTapEvent
    override fun onDoubleTapEvent (event: MotionEvent) : Boolean {
        gesture_status.text ="onDoubleTapEvent"
        return true

    }

    // implementasi untuk satu kali ketukan dikonfirmasi atau onSinglesTapConfirmed
    override fun onSingleTapConfirmed (event: MotionEvent): Boolean {
        gesture_status.text = "onSingleTapConfirmed"
        return true
    }
}
