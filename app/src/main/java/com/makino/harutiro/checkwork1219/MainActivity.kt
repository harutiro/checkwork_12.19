package com.makino.harutiro.checkwork1219

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

const val temp = 6

class MainActivity : AppCompatActivity() {

    var ans = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namView = findViewById<TextView>(R.id.namView)
        val pura1Button = findViewById<Button>(R.id.pura1button)

        pura1Button.setOnClickListener {
            ans++
            namView.text = ans.toString()

        }
    }
}