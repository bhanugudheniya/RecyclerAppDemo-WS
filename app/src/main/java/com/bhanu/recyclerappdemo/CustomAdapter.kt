package com.bhanu.recyclerappdemo

import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    //array of names
    val names = arrayOf("John","Smith","Kelly","Aron","Peter",
        "John","Smith","Kelly","Aron","Peter",
        "John","Smith","Kelly","Aron","Peter",
        "John","Smith","Kelly","Aron","Peter"
    )

    //array of images
    val uImages = intArrayOf(R.drawable.ic_launcher_foreground,R.mipmap.ic_launcher_round,R.drawable.ic_launcher_foreground,R.mipmap.ic_launcher_round,
        R.drawable.ic_launcher_foreground,R.mipmap.ic_launcher_round,R.drawable.ic_launcher_foreground,R.mipmap.ic_launcher_round,
        R.drawable.ic_launcher_foreground,R.mipmap.ic_launcher_round,R.drawable.ic_launcher_foreground,R.mipmap.ic_launcher_round,
        R.drawable.ic_launcher_foreground,R.mipmap.ic_launcher_round,R.drawable.ic_launcher_foreground,R.mipmap.ic_launcher_round,
        R.drawable.ic_launcher_foreground,R.mipmap.ic_launcher_round,R.drawable.ic_launcher_foreground,R.mipmap.ic_launcher_round
    )


    //access the views inside the layout you created
    class CustomViewHolder(v:View) : RecyclerView.ViewHolder(v) , View.OnClickListener {
        var myImage : ImageView
        var myName : TextView

        init {
            myImage = v.findViewById(R.id.userImage)
            myName = v.findViewById(R.id.userName)
            v.setOnClickListener{
                Toast.makeText(v.context,myName.text.toString(),Toast.LENGTH_SHORT).show()
//                Log.i("REVIEW", myName.text.toString())
            }
        }

        override fun onClick(p0: View?) {
            TODO("Not yet implemented")
        }
    }

    // Inflate the layout you have created
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_view,parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.myName.text = names[position]
//        holder.myImage.setImageResource(uImages[position])
    }

    override fun getItemCount(): Int {
        return names.count()
    }
}