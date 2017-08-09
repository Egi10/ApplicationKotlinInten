package com.example.egi_fcb.applicationkotlininten

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_data.*

class ActivityData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        setTitle("Data Lengkap")

        val intent: Intent = intent

        val nama: String = intent.getStringExtra("nama")
        nama_tv.text = nama

        val tanggal_lahir: String = intent.getStringExtra("tanggal_lahir")
        tanggal_lahir_tv.text = tanggal_lahir

        val jurusan: String = intent.getStringExtra("jurusan")
        jurusan_tv.text = jurusan

        val kelas: String = intent.getStringExtra("kelas")
        kelas_tv.text = kelas

        val alamat: String = intent.getStringExtra("alamat")
        alamat_tv.text = alamat

        btnBack.setOnClickListener{
            val intentt = Intent(this, MainActivity::class.java)
            startActivity(intentt)
        }
    }
}
