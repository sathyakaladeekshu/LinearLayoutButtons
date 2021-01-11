package com.sathya.linearlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** Called when the user touches the button */
        setContentView(R.layout.activity_main)
    }

    /** Called when the user touches the button */
    fun sendMessage(view: View) {
        // Do something in response to button click
        val textViewName: EditText = findViewById(R.id.textName)
       val labelName:TextView = findViewById(R.id.labelName)
        labelName.text =textViewName.text
    }
}

