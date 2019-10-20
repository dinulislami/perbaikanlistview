package com.example.listviewperbaikan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.row.view.*

class listadapter (var mCtx: Context, var resource:Int, var items:List<Type>)
    : ArrayAdapter<Type>(mCtx,resource,items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)

        val view: View = layoutInflater.inflate(resource , null)
        val imageView: ImageView = view.findViewById(R.id.foto)
        val textView: TextView = view.findViewById(R.id.jabatan)
        val textView1: TextView = view.findViewById(R.id.nama)

        var mItems:Type = items [position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItems.gambar))

        textView.text = mItems.judul
        textView1.text = mItems.deskripsi




        return view
    }

}