package com.sathya.linearlayoutexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.INFO
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


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

    fun showDynamicActivity(view: View) {
        setContentView(R.layout.activity_dynamic)
    }

    fun showAlert(view: View){
        var intent = Intent(this,AlertUpdatedActivity::class.java)
        startActivity(intent)
    }

    fun showIntent(view: View) {
        var intent = Intent()
        intent.action = Intent.ACTION_MAIN
        intent.addCategory(Intent.CATEGORY_APP_BROWSER)
        intent.flags =Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }


    fun showAlertDialog(view: View){
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Do you want to close this dialog (Y/N?")
            .setPositiveButton("yes") {
                    dialog,id -> finish()
                Toast.makeText(this,"You closed this", Toast.LENGTH_SHORT).show()
            }
        builder.setNegativeButton("no") {
                dialog,id -> dialog.cancel()
            Toast.makeText(this,"you choose no", Toast.LENGTH_SHORT).show()
        }
        builder.create()
    }

    fun login(view: View) {
         var intent = Intent(this,HomeActivity::class.java)
       var nameText:EditText= findViewById(R.id.nameText)
        println("name text${nameText.text}")
        intent.putExtra("userName",nameText.text.toString())
        startActivity(intent)
    }
}

