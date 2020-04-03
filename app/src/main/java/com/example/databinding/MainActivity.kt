package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.button.setOnClickListener {
            setTextToTextView()
        }
    }
    fun setTextToTextView(){
        binding.apply {
            textView.setText("Data Binding #1")
            textView2.setText("Data Binding #2")
            textView3.setText("Data Binding #3")
            invalidateAll()
        }
    }
}
