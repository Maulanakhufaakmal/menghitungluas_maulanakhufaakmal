package com.example.menghitungluas_maulanakhufaakmal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val dataset: ArrayList<Data>):
        RecyclerView.Adapter<Adapter.ViewHolder>(){
            class ViewHolder(view: View): RecyclerView.ViewHolder(view){
                val Hasil = view.findViewById<TextView>(R.id.hasil)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_adapter,parent,false)
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataset[position]
        holder.Hasil.text = data.hasil.toString()
    }

    override fun getItemCount(): Int = dataset.size
}