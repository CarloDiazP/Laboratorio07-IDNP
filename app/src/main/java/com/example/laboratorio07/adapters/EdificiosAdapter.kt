package com.example.laboratorio07.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio07.models.Edificio
import com.example.laboratorio07.R

class EdificiosAdapter(private val edificios: List<Edificio>) : RecyclerView.Adapter<EdificiosAdapter.EdificioViewHolder>() {

    class EdificioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.edificioName)
        val imageView: ImageView = itemView.findViewById(R.id.edificioImage)
        val viewButton: Button = itemView.findViewById(R.id.viewButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EdificioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_edificio, parent, false)
        return EdificioViewHolder(view)
    }

    override fun onBindViewHolder(holder: EdificioViewHolder, position: Int) {
        val edificio = edificios[position]
        holder.nameTextView.text = edificio.name
        holder.imageView.setImageResource(edificio.imageResource)
        // Agregar lógica de click en el botón, si es necesario
    }

    override fun getItemCount() = edificios.size
}
