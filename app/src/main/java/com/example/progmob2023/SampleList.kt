package com.example.progmob2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class SampleList : AppCompatActivity() {
    lateinit var btnShow : Button
    lateinit var btnRecycler : Button
    lateinit var btnCard : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)
        btnShow = findViewById(R.id.btnShowList)
        btnShow.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var intent = Intent(
                this@SampleList,
                SampleListView::class.java
            )
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnRecycler = findViewById(R.id.btnRecycler)
        btnRecycler.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var intent = Intent(
                this@SampleList,
                SampleRecyclerView::class.java
            )
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnCard = findViewById(R.id.btnCard)
        btnCard.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var intent = Intent(
                this@SampleList,
                SampleCardView::class.java
            )
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }

}