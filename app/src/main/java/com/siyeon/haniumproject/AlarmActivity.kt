package com.siyeon.haniumproject

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AlarmActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alarm_layout)

        title = "알림 센터"

        var buttonReturn = findViewById<Button>(R.id.button_return)
        buttonReturn.setOnClickListener {
            finish()
        }
    }
}