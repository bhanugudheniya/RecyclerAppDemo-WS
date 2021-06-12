 package com.bhanu.recyclerappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

 class MainActivity : AppCompatActivity() {

    lateinit var rv : RecyclerView
    lateinit var customAdapter: CustomAdapter
    lateinit var linearLayoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv = findViewById(R.id.rv)

        customAdapter = CustomAdapter()
        linearLayoutManager = LinearLayoutManager(this)

        //set dadapter and linearlayoutmanager on RV
        rv.adapter = customAdapter
        rv.layoutManager = linearLayoutManager

    }
}