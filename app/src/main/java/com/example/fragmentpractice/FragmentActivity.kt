package com.example.fragmentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val fragmentManager = supportFragmentManager
        val firstFragment = FirstFragment()

        //Transaction: 작업의 단위
        (findViewById<TextView>(R.id.add)).setOnClickListener {
            val transaction = fragmentManager.beginTransaction() //트랜잭션의 시작
            transaction.replace(R.id.root, firstFragment) //이 액티비티에서 root로 해 놓은데다가 프라그먼트를 붙임
            transaction.commit() //끝 : 끝을 내줘야 한 트랜잭션이 정의되는거라 그제서야  실행됨!
        }

        (findViewById<TextView>(R.id.remove)).setOnClickListener {
            val transaction = fragmentManager.beginTransaction()
            transaction.remove(firstFragment)
            //같은 프라그먼트를 여러 번 재사용 가능!!
            transaction.commit()
        }


    }
}