package com.example.listviewpractive1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewpractive1.R
import com.example.listviewpractive1.datas.Student2
import kotlinx.android.synthetic.main.student_list_item2.view.*


class StudentAdapter2() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var datas: List<Student2> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.student_list_item2, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is MyViewHolder -> {
                holder.bind(datas.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val studentNameTxt: TextView = itemView.studentNameTxt
        val studentBirthYearTxt: TextView = itemView.studentBirthYearTxt

        fun bind(student: Student2) {
            studentNameTxt.setText(student.name)
            studentBirthYearTxt.setText(student.birthYear)
        }
    }


}