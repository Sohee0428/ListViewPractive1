package com.example.listviewpractive1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractive1.adapters.StudentAdapter
import com.example.listviewpractive1.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val mStudentList = ArrayList<Student>()


    lateinit var mAdapter : StudentAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mStudentList.add( Student("유재석", 1972))
        mStudentList.add( Student("박명수", 1970))
        mStudentList.add( Student("정준하", 1971))
        mStudentList.add( Student("하동훈", 1979))
        mStudentList.add( Student("정형돈", 1978))
        mStudentList.add( Student("노홍철", 1979))


        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)


        studentListView.adapter = mAdapter

    }
}