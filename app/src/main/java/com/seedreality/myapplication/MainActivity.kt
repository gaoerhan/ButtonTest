package com.seedreality.myapplication

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    val TAG:String = "VolumeButton"
    lateinit var tvButtonInfo:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvButtonInfo = findViewById(R.id.tv_button_info)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_VOLUME_DOWN -> {
                // 音量减小时应该执行的功能代码
                Log.d(TAG,"keyCode: ${keyCode.toString()} , volume down button is pressed")
                tvButtonInfo.text = "音量减被点击,keyCode: ${keyCode.toString()}"
                return true
            }
            KeyEvent.KEYCODE_VOLUME_UP -> {
                // 音量增大时应该执行的功能代码
                Log.d(TAG,"keyCode: ${keyCode.toString()} ,volume up button is pressed")
                tvButtonInfo.text = "音量加被点击,keyCode: ${keyCode.toString()}"
                return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }
}