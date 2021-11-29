package com.example.studyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.kotlin_row.view.*

class KotlinAdapter(private val items : ArrayList<ArrayList<String>>, private val theContext: Context) :RecyclerView.Adapter<KotlinAdapter.ViewHolder>() {
    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.kotlin_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item = items[position]
        holder.itemView.apply {
            tvTitleKotlin.text = item[0]
            tvDescriptionKotlin.text = item[1]
        }
        holder.itemView.setOnClickListener {
            val alertObj = Alert()
            alertObj.customAlert(item,theContext)
        }
    }

    override fun getItemCount() = items.size



}