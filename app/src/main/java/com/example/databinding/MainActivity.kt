package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val myname:Myname=Myname("Prateek")
//    private val mynickname:Myname=Myname("Tiwari")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.bindingname=myname
//        binding.name=mynickname
        binding.button.setOnClickListener {
            setTextToTextView()
        }
    }
    fun setTextToTextView(){
        binding.apply {
            bindingname?.nickname=editText2.text.toString()
            //textView3.setText("Data Binding #2")
            invalidateAll()
        }
    }
}
