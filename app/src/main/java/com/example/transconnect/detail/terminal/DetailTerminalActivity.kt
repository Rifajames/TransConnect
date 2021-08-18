package com.example.transconnect.detail.terminal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.transconnect.R
import com.example.transconnect.data.terminal.Terminal
import com.example.transconnect.terminal.ListTerminalActivity

class DetailTerminalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_terminal)

        val terminal = intent.getParcelableExtra<Terminal>(ListTerminalActivity.INTENT_PARCELABLE)

        val timgSrc = findViewById<ImageView>(R.id.imageView2)
        val terminalnama = findViewById<TextView>(R.id.terminal_nama)
        val talamat_terminal = findViewById<TextView>(R.id.alamat_terminal)
        val tpengunjung = findViewById<TextView>(R.id.pengunjung_terminal)
        val trute = findViewById<TextView>(R.id.rute_terminal)

        if (terminal != null){
            timgSrc.setImageResource(terminal.tImgSrc)
            terminalnama.text = terminal.terminalKoridor
            talamat_terminal.text = terminal.terminaladdress
            tpengunjung.text = terminal.terminalpassanger
            trute.text = terminal.terminalroute
        }
    }
}