package com.example.listviewpractive1.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewpractive1.R
import com.example.listviewpractive1.datas.Student2

class StudentAdapter2(
    val mContext: Context,
    val resId: Int,
    val list: ArrayList<Student2>) : ArrayAdapter<Student2>(mContext, resId, list) {

        val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inflater.inflate(R.layout.student_list_item2, null)
        }

        val row = tempRow!!

        return row
    }

}