package com.example.recyclerview_naswa_22

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailNaswaActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_naswa)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val naswa = intent.getParcelableExtra<Naswa>(MainActivity.INTENT_PARCELABLE)

        val imgNaswa = findViewById<ImageView>(R.id.img_item_photo)
        val nameNaswa = findViewById<TextView>(R.id.tv_item_name)
        val descNaswa = findViewById<TextView>(R.id.tv_item_description)

        imgNaswa.setImageResource(naswa?.imgNaswa!!)
        nameNaswa.text = naswa.nameNaswa
        descNaswa.text = naswa.descNaswa
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}