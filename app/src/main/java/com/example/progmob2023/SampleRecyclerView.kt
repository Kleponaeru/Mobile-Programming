package com.example.progmob2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob2023.adapter.PetaniAdapter
import com.example.progmob2023.model.Petani.Petani

class SampleRecyclerView : AppCompatActivity() {
    lateinit var rvSample: RecyclerView
    lateinit var petaniAdapter: PetaniAdapter
    lateinit var lPetani: List<Petani>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_recycler_view)

        rvSample = findViewById(R.id.rvLatihan)

        lPetani = listOf(
            Petani(user = "User 1", nama = "John", jumlahLahan = "103", identifikasi = "223", tambahLahan = "999"),
            Petani(user = "User 2", nama = "Alice", jumlahLahan = "115", identifikasi = "422", tambahLahan = "211"),
            Petani(user = "User 3", nama = "Bob", jumlahLahan = "200", identifikasi = "51", tambahLahan = "27"),
            Petani(user = "User 4", nama = "Sponge", jumlahLahan = "200", identifikasi = "51", tambahLahan = "27")
        )

        petaniAdapter = PetaniAdapter(lPetani)

        rvSample.apply {
            layoutManager = LinearLayoutManager(this@SampleRecyclerView)
            adapter = petaniAdapter
        }
    }
}
