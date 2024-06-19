package com.akirachix.fibonaccisequence

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class NumbersRecyclerView (var numbers:List<Int>):RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_item,
           parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
      holder.tvNumber.text=numbers[position].toString()
    }

    override fun getItemCount(): Int {
       return numbers.size
    }
}

class NumbersViewHolder(itemView:View):
        RecyclerView.ViewHolder(itemView){
            val tvNumber = itemView.findViewById<TextView>(R.id.tvNumbers)
        }