package com.example.transconnect.terminal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.transconnect.DataAdapter
import com.example.transconnect.DataCallback
import com.example.transconnect.R
import com.example.transconnect.data.bus.Bus
import com.example.transconnect.data.bus.BusViewModel
import com.example.transconnect.data.terminal.Terminal
import com.example.transconnect.data.terminal.TerminalViewModel
import com.example.transconnect.detail.terminal.DetailTerminalActivity
import kotlinx.android.synthetic.main.activity_list_terminal.*
import kotlinx.android.synthetic.main.fragment_bus.*
import kotlinx.android.synthetic.main.terminal_item.*

class ListTerminalActivity : AppCompatActivity(){

    private lateinit var viewModel: TerminalViewModel
    companion object{
        val INTENT_PARCELABLE ="OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_terminal)

        val TerminalList = listOf<Terminal>(
                Terminal("1","Terminal Blok M","Blok M - Masjid Agung","30","Melawai, Kebayoran Baru, South Jakarta City, Jakarta",R.drawable.trans1),
                Terminal("2","Terminal Masjid Agung","Masjid Agung - Bundaran Senayan","22","Jl. Sisingamangaraja, RT.2/RW.1, Gunung, Kec. Kby. Baru, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12120",R.drawable.trans1),
                Terminal("3","Terminal Bundaran Senayan","Bundaran Senayan - Gelora Bung Karno","16","Bundaran Senayan",R.drawable.trans1),
                Terminal("4","Terminal Gelora Bung Karno","Gelora Bung Karno - Polda Metro Jaya","29","Jalan Jenderal Sudirman, Indonesia, Daerah Khusus Ibukota Jakarta",R.drawable.trans1),
                Terminal("5","Terminal Polda Metro Jaya","Polda Metro Jaya - Bendungan Hilir","36","Gelora, Tanah Abang, Central Jakarta City, Jakarta",R.drawable.trans1),
                Terminal("6","Terminal Bendungan Hlir","Bendungan Hilir - Karet Sudirman","84","Bendungan Hilir",R.drawable.trans1)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_terminal)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = TerminalAdapter(this,TerminalList){
            val intent = Intent(this, DetailTerminalActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }


}