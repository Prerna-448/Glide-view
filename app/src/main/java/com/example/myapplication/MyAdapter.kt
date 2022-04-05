package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.math.MathContext

class MyAdapter(
    var context: Context,
    var data: ArrayList<ModelClass>
) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {



            // Define click listener for the ViewHolder's View.
           var textView = view.findViewById<TextView>(R.id.text)
           var img = view.findViewById<ImageView>(R.id.img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.my_layout, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        var userData = data[position]

        holder.textView.text = userData.name
        Glide.with(context).load(userData.img).into(holder.img);
    }

    override fun getItemCount(): Int {
        return data.size
    }
}