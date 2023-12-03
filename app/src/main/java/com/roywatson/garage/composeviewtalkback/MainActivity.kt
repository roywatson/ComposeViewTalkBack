package com.roywatson.garage.composeviewtalkback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    lateinit var composeView: TalkBackComposeView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        composeView = findViewById<TalkBackComposeView>(R.id.compose_view)
    }

    fun onBBB() {
        val model: TalkBackComposeViewViewModel by viewModels()
        model.showSettings.value = !model.showSettings.value
    }
}