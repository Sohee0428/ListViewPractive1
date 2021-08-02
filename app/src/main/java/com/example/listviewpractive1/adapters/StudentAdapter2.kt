package com.example.listviewpractive1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewpractive1.R
import com.example.listviewpractive1.datas.Student2


class StudentAdapter2(val data: Array<Student2>) :
    RecyclerView.Adapter<StudentAdapter2.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val textView1: TextView
        val textView2: TextView

        init {
            textView1 = view.findViewById(R.id.studentNameTxt)
            textView2 = view.findViewById(R.id.studentBirthYearTxt)

        }

        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
            val view =
                LayoutInflater.from(viewGroup.context)
                    .inflate(R.layout.student_list_item2, viewGroup, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

            viewHolder.textView1.text = data[position]
        }

        override fun getItemCount() = data[size]
    }

}