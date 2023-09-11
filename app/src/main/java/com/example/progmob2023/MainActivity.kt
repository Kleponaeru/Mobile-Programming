package com.example.progmob2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editInputNama : EditText
    lateinit var tvMain : TextView
    lateinit var tvMain2 : TextView
    lateinit var btnMain : Button
    lateinit var btnHelp : Button
    lateinit var btnLinear : Button
    lateinit var btnCons : Button
    lateinit var btnTable: Button
    lateinit var btnProtein : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvMain = findViewById(R.id.textView)
        tvMain.text = getString(R.string.hello_progmob_2023)

        tvMain2 = findViewById(R.id.textView2)
        tvMain2.text = getString(R.string.progmob_2023)

        btnMain = findViewById(R.id.button)
        btnMain.text = "PROGMOB 2023"
        btnHelp = findViewById(R.id.btn_help)

        editInputNama = findViewById(R.id.ed_input_nama)
        btnMain.setOnClickListener(View.OnClickListener {
            var strTmp = editInputNama.text.toString()
            tvMain.text = strTmp
        })
        btnHelp.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = editInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity,
                HelpActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnLinear = findViewById(R.id.btn_linear)
        btnLinear.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var intent = Intent(this@MainActivity,
                LinearActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnCons = findViewById(R.id.btn_cons)
        btnCons.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var intent = Intent(this@MainActivity,
                ConstraintActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnTable = findViewById(R.id.btn_table)
        btnTable.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var intent = Intent(this@MainActivity,
                TableActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnProtein = findViewById(R.id.btn_protein)
        btnProtein.setOnClickListener(View.OnClickListener {
            var bundle = Bundle()
            var intent = Intent(this@MainActivity,
                ProteinTrackerActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        }
}