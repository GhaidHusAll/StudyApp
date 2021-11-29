package com.example.studyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.android_row.view.*

class AndroidAdapter(private val items : ArrayList<ArrayList<String>>, private val theContext: Context): RecyclerView.Adapter<AndroidAdapter.ViewHolder>() {
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      return ViewHolder(
          LayoutInflater.from(parent.context).inflate(
              R.layout.android_row,
              parent,
              false
          )
      )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item = items[position]
        holder.itemView.apply {
            tvTitleAndroid.text = item[0]
            tvDescriptionAndroid.text = item[1]
        }
        holder.itemView.setOnClickListener {
            val alertObj = Alert()
            alertObj.customAlert(item,theContext)
        }
    }

    override fun getItemCount() = items.size
}