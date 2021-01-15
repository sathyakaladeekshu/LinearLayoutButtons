package com.sathya.linearlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** Called when the user touches the button */
        setContentView(R.layout.activity_main)
    }

    fun showLogin(view: View) {
        setContentView(R.layout.activity_login)
    }

    fun showListActivity(view: View) {
        setContentView(R.layout.activity_static_list)
    }

    fun sendMessage(view: View) {
        // Do something in response to button click
        val textViewName: EditText = findViewById(R.id.textName)
        val labelName: TextView = findViewById(R.id.labelName)
        labelName.text =textViewName.text
    }

    fun showButtonActivity(view: View) {
        setContentView(R.layout.activity_button)
    }

    fun goHome(view: View) {
        setContentView(R.layout.activity_main)
    }
}

