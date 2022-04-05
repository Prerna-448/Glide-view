package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var My_RecyclerView: RecyclerView

    lateinit var Adapter : MyAdapter

    var array: ArrayList<ModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        My_RecyclerView = findViewById(R.id.my_recycler)


        var data1 = ModelClass("Anuj","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRALv7YcUv2AKyp-RX7xr3hkB-DFmz5Vm4vkA&usqp=CAU")
        var data2 = ModelClass("Karishma","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRALv7YcUv2AKyp-RX7xr3hkB-DFmz5Vm4vkA&usqp=CAU")
        var data3 = ModelClass("Diksha","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRALv7YcUv2AKyp-RX7xr3hkB-DFmz5Vm4vkA&usqp=CAU")
        var data4 = ModelClass("Masoom","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRALv7YcUv2AKyp-RX7xr3hkB-DFmz5Vm4vkA&usqp=CAU")
        var data5 = ModelClass("Prerna","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRALv7YcUv2AKyp-RX7xr3hkB-DFmz5Vm4vkA&usqp=CAU")
        var data6 = ModelClass("Aditya","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRALv7YcUv2AKyp-RX7xr3hkB-DFmz5Vm4vkA&usqp=CAU")

        array.add(data1)
        array.add(data2)
        array.add(data3)
        array.add(data4)
        array.add(data5)
        array.add(data6)


        // this creates a vertical layout Manager
        My_RecyclerView.layoutManager = GridLayoutManager(this,2)



        // This will pass the ArrayList to our Adapter
        Adapter = MyAdapter(this, array)

        // Setting the Adapter with the recyclerview
        My_RecyclerView.adapter = Adapter

    }

}