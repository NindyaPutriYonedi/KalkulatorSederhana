package com.nindy.mi2anindy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnClick : Button
    private lateinit var btnPageKedua : Button
    private lateinit var btnKalkulator : Button
    private lateinit var btnPassingData : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnClick = findViewById(R.id.btnClickHere)
        btnPageKedua = findViewById(R.id.btnPageKedua)
        btnKalkulator = findViewById(R.id.btnKalkulatorSederhana)
        btnPassingData = findViewById(R.id.btnPassingData)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnClick.setOnClickListener(){
            Toast.makeText(this,"Anda klik button click here!", Toast.LENGTH_SHORT).show()
        }

        btnPageKedua.setOnClickListener(){
            val intentMenu2 = Intent(this@MainActivity, PageKeduaActivity::class.java)
            startActivity(intentMenu2)
        }

        btnKalkulator.setOnClickListener(){
            val intentMenu2 = Intent(this@MainActivity, KalkulatorSederhanaActivity::class.java)
            startActivity(intentMenu2)
        }

        btnPassingData.setOnClickListener(){
            val intentMenu2 = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intentMenu2)
        }
    }
}