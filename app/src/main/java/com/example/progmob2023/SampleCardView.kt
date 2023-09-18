package com.example.progmob2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob2023.adapter.PetaniCVAdapter
import com.example.progmob2023.model.Petani.Petani

class SampleCardView : AppCompatActivity() {
    lateinit var rvSample: RecyclerView
    lateinit var petaniAdapter: PetaniCVAdapter
    lateinit var lPetaniCV: List<Petani>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)

        rvSample = findViewById(R.id.rvCard)

        lPetaniCV = listOf(
            Petani(user = "User 1", nama = "JohnTzy", jumlahLahan = "103", identifikasi = "223", tambahLahan = "412"),
            Petani(user = "User 2", nama = "AliceTzy", jumlahLahan = "115", identifikasi = "422", tambahLahan = "211"),
            Petani(user = "User 3", nama = "BobTzy", jumlahLahan = "200", identifikasi = "51", tambahLahan = "27")
        )

        petaniAdapter = PetaniCVAdapter(lPetaniCV)

        rvSample.apply {
            layoutManager = LinearLayoutManager(this@SampleCardView)
            adapter = petaniAdapter
        }
    }
    }
