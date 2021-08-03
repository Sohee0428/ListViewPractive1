package com.example.listviewpractive1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listviewpractive1.adapters.StudentAdapter2
import com.example.listviewpractive1.datas.Student2
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    val studentList2 = ArrayList<Student2>()

    lateinit var adapter2 : StudentAdapter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initRecyclerView()

        studentList2.add( Student2("유재석", 1972))
        studentList2.add( Student2("박명수", 1970))
        studentList2.add( Student2("정준하", 1971))
        studentList2.add( Student2("하동훈", 1979))
        studentList2.add( Student2("정형돈", 1978))
        studentList2.add( Student2("노홍철", 1979))

//        adapter = StudentAdapter2(this, R.layout.student_list_item2, studentList2)
//        recyclerView.adapter = adapter

    }

    private fun initRecyclerView(){
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity2)
            adapter2 = StudentAdapter2()
            recyclerView.adapter = adapter2
        }
    }
}