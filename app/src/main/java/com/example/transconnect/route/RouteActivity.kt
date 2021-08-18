package com.example.transconnect.route

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.transconnect.R
import com.example.transconnect.data.terminal.Terminal
import com.example.transconnect.data.terminal.TerminalViewModel
import com.example.transconnect.detail.terminal.DetailTerminalActivity
import com.example.transconnect.terminal.ListTerminalActivity
import com.example.transconnect.terminal.TerminalAdapter
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_route.*

class RouteActivity : AppCompatActivity() {

    private lateinit var viewModel: TerminalViewModel
    companion object{
        val INTENT_PARCELABLE ="OBJECT_INTENT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route)

        btn_search.setOnClickListener {
            val startpoint = etstartroute.text.toString().trim()
            val endpoint = etendroute.text.toString().trim()

            if(startpoint.isEmpty()){
                etstartroute.error = "Start point harus diisi"
                etstartroute.requestFocus()
                return@setOnClickListener
            }

            if(endpoint.isEmpty()){
                etendroute.error = "End point harus diisi"
                etendroute.requestFocus()
                return@setOnClickListener
            }
            terminallist()
        }


    }

    private fun terminallist() {
        val TerminalList = listOf<Terminal>(
                Terminal("3","Terminal Bundaran Senayan","Bundaran Senayan - Gelora Bung Karno","16","Bundaran Senayan",R.drawable.trans1),
                Terminal("4","Terminal Gelora Bung Karno","Gelora Bung Karno - Polda Metro Jaya","29","Jalan Jenderal Sudirman, Indonesia, Daerah Khusus Ibukota Jakarta",R.drawable.trans1),
                Terminal("5","Terminal Polda Metro Jaya","Polda Metro Jaya - Bendungan Hilir","36","Gelora, Tanah Abang, Central Jakarta City, Jakarta",R.drawable.trans1),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_routelist)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = TerminalAdapter(this,TerminalList){
            val intent = Intent(this, DetailTerminalActivity::class.java)
            intent.putExtra(ListTerminalActivity.INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }
}