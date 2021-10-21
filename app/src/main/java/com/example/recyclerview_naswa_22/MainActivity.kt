package com.example.recyclerview_naswa_22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion  object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aryazafriList = listOf<Naswa>(
            Naswa(
                R.drawable.awa1,
                "Naswa Bila Zakia Fr",
                "Mama said I'm beautiful"
            ),
            Naswa(
                R.drawable.awa2,
                "Naswa Bila Zakia Fr",
                "I'm a woman who has a best friend named Chika"
            ),
            Naswa(
                R.drawable.awa3,
                "Naswa Bila Zakia Fr",
                "she is a friendly woman and likes to greet people around"
            ),
            Naswa(
                R.drawable.awa4,
                "Naswa Bila Zakia Fr",
                "she is a woman who likes to cook but doesn't like to eat"
            ),
            Naswa(
                R.drawable.awa5,
                "Naswa Bila Zakia Fr",
                "she is a woman who likes quiet but doesn't like loneliness"
            ),
            Naswa(
                R.drawable.awa6,
                "Naswa Bila Zakia Fr",
                "she is a woman who can hide sadness"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_naswa)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = NaswaAdapter(this, aryazafriList){
            val intent = Intent (this, DetailNaswaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}