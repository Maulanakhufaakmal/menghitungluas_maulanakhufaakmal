package com.example.menghitungluas_maulanakhufaakmal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewManager
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var panjang : EditText
    private lateinit var lebar : EditText
    private lateinit var luas : RadioButton
    private lateinit var keliling : RadioButton
    private lateinit var button : Button
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter:RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var rumus : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        panjang = findViewById(R.id.etpanjang)
        lebar = findViewById(R.id.etlebar)
        luas = findViewById(R.id.rblluas)
        keliling = findViewById(R.id.rbkeliling)
        button = findViewById(R.id.btnhitung)


        val data = ArrayList<Data>()
        recyclerView = findViewById(R.id.listdata)

        button.setOnClickListener {

            var panjang = panjang.text.toString().toInt()
            var lebar = lebar.text.toString().toInt()

            if (luas.isChecked) {
                 rumus = (panjang * lebar)
                rumus.toString()

                val tampil = Data(rumus)
                data.add(tampil)
                recyclerAdapter.notifyDataSetChanged()

            }else
            {
                rumus = ((2* lebar) + (2* lebar))
                rumus.toString()

                val tampil = Data(rumus)
                data.add(tampil)
                recyclerAdapter.notifyDataSetChanged()

            }
        }
        viewManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerAdapter =Adapter(data)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = viewManager
    }
}