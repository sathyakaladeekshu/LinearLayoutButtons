package com.sathya.linearlayoutexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.widget.ListView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var welcomeText: TextView =findViewById(R.id.welcome)

        var userString:String? = intent.getStringExtra("userName")
        welcomeText.text =userString

    }

}