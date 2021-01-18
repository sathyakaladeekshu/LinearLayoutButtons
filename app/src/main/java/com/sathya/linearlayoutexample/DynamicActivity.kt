package com.sathya.linearlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class DynamicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)
        var staticList = resources.getStringArray(R.array.chocolates)
        println("static list $staticList")
        var arrayListChoc = listOf<String>("milk chocolate")
        var arrayAdapter = ArrayAdapter<String>(this,android.R.layout
            .simple_list_item_1,android.R.id.text1,arrayListChoc)
        var listView:ListView =findViewById(R.id.dynamicList)
        println("listView $listView")
        listView.adapter = arrayAdapter
    }
}