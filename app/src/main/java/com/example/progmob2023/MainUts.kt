package com.example.progmob2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainUts : AppCompatActivity() {
    private val list = ArrayList<PostResponse>()
    lateinit var rvPost: RecyclerView
    lateinit var tvResponseCode: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_uts)
        rvPost = findViewById(R.id.rvPost)
        tvResponseCode = findViewById(R.id.tvResponseCode)

        rvPost.setHasFixedSize(true)
        rvPost.layoutManager = LinearLayoutManager(this)
        RetrofitClient.instance.getAllMahasiswa().enqueue(object: retrofit2.Callback<ArrayList<PostResponse>>{
            override fun onResponse(
                call: Call<ArrayList<PostResponse>>,
                response: Response<ArrayList<PostResponse>>
            ) {
                val responseCode = response.code().toString()
                tvResponseCode.text = responseCode
                response.body()?.let { list.addAll(it)}
                val adapter = PostAdapter(list)
                rvPost.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<PostResponse>>, t: Throwable) {

            }

        })
    }
}