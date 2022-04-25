package com.example.fragmentpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflater: XML을 화면에 사용할 준비를 한다 (xml을 뷰로 만들어줌)
        //container: 프라그먼트에서 사용될 XML의 부모뷰

        //container의 자식 뷰로 R.layout.fragment_first레이아웃을 붙여줌
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
}