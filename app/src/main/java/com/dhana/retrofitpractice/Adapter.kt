package com.dhana.retrofitpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dhana.retrofitpractice.Adapter.AdapterViewHolder

class Adapter(val context: Context, val userlist: List<DataItem>) :
    RecyclerView.Adapter<AdapterViewHolder>() {


    class AdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var userId: TextView
        var userTitle: TextView

        init {
            userId = itemView.findViewById(R.id.user_id)
            userTitle = itemView.findViewById(R.id.user_title)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_items, parent, false)
        return AdapterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {

        holder.userId.text = userlist[position].id.toString()
        holder.userTitle.text = userlist[position].title
    }

    override fun getItemCount(): Int {
        return userlist.size
    }
}