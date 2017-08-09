package com.example.egi_fcb.applicationkotlininten

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Pengisian Data")

        var move = findViewById(R.id.moveBtn) as Button

        move.setOnClickListener{
            move()
        }
    }

    private fun move(){
        var nama = findViewById(R.id.nama) as EditText
        var tanggal_lahir = findViewById(R.id.tanggal_lahir) as EditText
        var jurusan = findViewById(R.id.jurusan) as EditText
        var kelas = findViewById(R.id.kelas) as EditText
        var alamat = findViewById(R.id.alamat) as EditText

        val intent = Intent(this, ActivityData::class.java)
        intent.putExtra("nama", nama.text.toString())
        intent.putExtra("tanggal_lahir", tanggal_lahir.text.toString())
        intent.putExtra("jurusan", jurusan.text.toString())
        intent.putExtra("kelas", kelas.text.toString())
        intent.putExtra("alamat", alamat.text.toString())
        startActivity(intent)
    }
}
