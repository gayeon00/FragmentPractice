package com.example.fragmentpractice

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.findViewById<TextView>(R.id.call_activity).setOnClickListener {
            //여러 액티비티가 이 프라그먼트를 사용할 수 있어서 어떤 액티비티 인지 정확히 캐스팅 해주기
            (activity as FragmentActivity).printTestLog()
        }

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //데이터를 찾아오는 작업을 할 때는 프라그먼트도 onCreate에서 하도록!

        val data = arguments?.getString("key")
        Log.d("testt", "data is "+data)
    }
}