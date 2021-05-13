package com.example.listviewpractive1.datas

import android.util.Log


// 학생 하위 정보 - 이름, 출생년도


class Student( val name : String, val birthYear : Int ) {

//    (예시) 학생의 기능으로 자신의 이름을 로그로 찍는 기능

    fun printMyNameToLog(num1: Int, num2: Double) : Boolean {

//        num1이 num2 보다 더 크다면, 로그를 이름만
//        그렇지 않다면, 이름과 인사도 로그 출력

        if ( num1 > num2) {
            Log.d("연습용",this.name)

            return false

        } else {
            Log.d("연습용", this.name)
            Log.d("연습용","잘 부탁드립니다.")

        }

        return true
    }

}
