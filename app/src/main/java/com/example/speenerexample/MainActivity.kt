package com.example.speenerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.speenerexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val Spinnerarray= arrayOf("tabon","mazaj","taylande","laet house")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
         val view =binding.root
        setContentView(view)
        val a=ArrayAdapter(this,android.R.layout.simple_list_item_1,Spinnerarray)
        binding.spinner00 .adapter= a
        binding.button00.setOnClickListener {
            val selectedInfobutton = binding.spinner00.selectedItem.toString()

            Toast.makeText(this,selectedInfobutton,Toast.LENGTH_LONG).show()

        }
     binding.spinner00.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
         override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {


         }
     }


     }
    }
}