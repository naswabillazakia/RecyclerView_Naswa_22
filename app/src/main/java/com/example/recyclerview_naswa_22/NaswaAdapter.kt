package com.example.recyclerview_naswa_22

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NaswaAdapter(private val context: Context, private val naswa: List<Naswa>, val listener: (Naswa) -> Unit)
    : RecyclerView.Adapter<NaswaAdapter.NaswaViewHolder>(){

    class NaswaViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgNaswa = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameNaswa = view.findViewById<TextView>(R.id.tv_item_name)
        val descNaswa = view.findViewById<TextView>(R.id.tv_item_description)

        fun  bindView(naswa: Naswa, listener: (Naswa) -> Unit){
            imgNaswa.setImageResource(naswa.imgNaswa)
            nameNaswa.text = naswa.nameNaswa
            descNaswa.text = naswa.descNaswa
            itemView.setOnClickListener{
                listener(naswa)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NaswaViewHolder {
        return NaswaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_naswa, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NaswaViewHolder, position: Int) {
        holder.bindView(naswa[position], listener)
    }

    override fun getItemCount(): Int = naswa.size

}