package com.example.globalsilence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.globalsilence.HS.HS
import com.example.globalsilence.adapter.MyAdapter

val listOfLengthDeep = listOf<Int>(500,600,700,800)

val listOfLengthSide = listOf<Int>(2300,1810,1400,900)
val listOfLengthSmall = listOf<Int>(2060,1680,1200,785)
val listOfLengthBottom = listOf<Int>(1900,1485,1000,580)

var arrayAgregat = arrayOf("Боковое","Нижнее","Малый")
var arrayHeight:Array<Int> = arrayOf(850)
var arrayDeep:Array<Int> = listOfLengthDeep.toTypedArray()
var arrayWidth:Array<Int> = arrayOf()
var arrayDoor:Array<Int> = arrayOf()
var arrayBox:Array<Int> = arrayOf()


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spinnerAdapterAgr = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arrayAgregat)
        val spinnerAgregat: Spinner = findViewById(R.id.spinnerAgregat)
        spinnerAgregat.adapter = spinnerAdapterAgr

        var spinnerAdapterWid = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arrayWidth)
        val spinnerWid: Spinner = findViewById(R.id.spinnerWidth)
        spinnerWid.adapter = spinnerAdapterWid

        val spinnerAdapterDeep = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arrayDeep)
        val spinnerDeep: Spinner = findViewById(R.id.spinnerDeep)
        spinnerDeep.adapter = spinnerAdapterDeep

        val spinnerAdapterHeight = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arrayHeight)
        val spinnerHeight: Spinner = findViewById(R.id.spinnerHeight)
        spinnerHeight.adapter = spinnerAdapterHeight

        var spinnerAdapterDoor = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arrayDoor)
        val spinnerDoor: Spinner = findViewById(R.id.spinnerDoor)
        spinnerDoor.adapter = spinnerAdapterDoor

        var spinnerAdapterBox = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arrayBox)
        val spinnerBox: Spinner = findViewById(R.id.spinnerBox)
        spinnerBox.adapter = spinnerAdapterBox

        spinnerAgregat.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                 when(spinnerAgregat.selectedItem){
                    "Боковое"-> {
                        arrayWidth = listOfLengthSide.toTypedArray()
                        arrayDoor = arrayOf(4,3,2,1,0)
                        arrayBox = arrayOf(0,1,2,3,4)
                    }
                    "Нижнее"-> {
                     arrayWidth = listOfLengthBottom.toTypedArray()
                    }
                    "Малый"-> {
                        arrayWidth =listOfLengthSmall.toTypedArray()
                    }
                }
                spinnerAdapterWid = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_dropdown_item, arrayWidth)
                spinnerWid.adapter = spinnerAdapterWid
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        fun getListOfNameAsserts():Array<String> {
            val hs = HS(
                spinnerDoor.selectedItem.toString().toInt(),
                spinnerBox.selectedItem.toString().toInt(),
                spinnerDeep.selectedItem.toString().toInt(),
                spinnerAgregat.selectedItem.toString(),
                "Среднетемпературный"

            )
            println(hs.name)
            val names = mutableListOf<String>()
            hs.listOfAsserts.forEach {
                if (it != null) {
                    names.add(it.name)
                }
            }
            return names.toTypedArray()
        }
        fun getListOfNameParts(): Array<String> {
            val hs = HS(
                spinnerDoor.selectedItem.toString().toInt(),
                spinnerBox.selectedItem.toString().toInt(),
                spinnerDeep.selectedItem.toString().toInt(),
                spinnerAgregat.selectedItem.toString(),
                "Среднетемпературный"

            )
            val names = mutableListOf<String>()
            hs.listOfParts.forEach {
                if (it != null) {
                    names.add(it.name)
                }
            }
            return names.toTypedArray()

        }


        spinnerWid.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                spinnerAdapterDoor = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_dropdown_item, arrayDoor)
                spinnerDoor.adapter = spinnerAdapterDoor
                spinnerAdapterBox = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_dropdown_item, arrayBox)
                spinnerBox.adapter = spinnerAdapterBox

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        spinnerDoor.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                var asserts = getListOfNameAsserts()
                var parts = getListOfNameParts()

                val recycleViewAsserts = findViewById<RecyclerView>(R.id.recyclerViewAsserts)
                recycleViewAsserts.layoutManager = LinearLayoutManager(this@MainActivity)
                recycleViewAsserts.adapter = MyAdapter(asserts)


                val recyclerViewParts = findViewById<RecyclerView>(R.id.recyclerViewParts)
                recyclerViewParts.layoutManager = LinearLayoutManager(this@MainActivity)
                val adapter2 = MyAdapter(parts)
                recyclerViewParts.adapter = adapter2


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }





    }


}