package com.shankar.assginmentsix.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shankar.assginmentsix.R
import com.shankar.assginmentsix.model.student
import de.hdodenhof.circleimageview.CircleImageView

class studentAdapter(
        val lstStudent: ArrayList<student>,
        val context: Context
) : RecyclerView.Adapter<studentAdapter.StudentViewHolder>() {
    class StudentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView
        val tvAddress: TextView
        val tvAge: TextView
        val gender: TextView
        val btnImage: ImageButton

        init {
            tvName = view.findViewById(R.id.tvName)
            tvAddress = view.findViewById(R.id.tvAddress)
            tvAge = view.findViewById(R.id.tvAge)
            gender = view.findViewById(R.id.tvgender)
            btnImage = view.findViewById(R.id.imageButton)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.studentview, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = lstStudent[position]
        holder.tvName.text = student.StudentName
        holder.tvAddress.text = student.address
        holder.tvAge.text = student.age.toString()
        holder.gender.text = student.gender
        holder.btnImage.setOnClickListener {
            lstStudent.removeAt(position)
            notifyDataSetChanged()

        }

    }

    override fun getItemCount(): Int {
        return lstStudent.size
    }
}

