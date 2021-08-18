package com.example.transconnect.data

import com.example.transconnect.R
import com.example.transconnect.data.bus.Bus
import com.example.transconnect.data.terminal.Terminal

object DataDummy {
    fun getdataBus(): ArrayList<Bus>{
        return arrayListOf(
                Bus("tj01","Blok M - Masjid Agung","11320", R.drawable.trans1,"3","18"),
                Bus("tj02","Masjid Agung -Bundaran Senayan","11420", R.drawable.trans2,"9","12"),
                Bus("tj03","Bundaran Senayan - Gelora Bund Karno","11310", R.drawable.trans1,"0","21"),
                Bus("tj04","Gelora Bund Karno - Polda Metro Jaya","16582", R.drawable.trans2,"6","15"),
                Bus("tj05","Polda Metro Jaya - Bendungan Hilir","12602", R.drawable.trans1,"1","20"),
                Bus("tj06","Bendungan Hilir - Karet Sudirman","15834", R.drawable.trans2,"3","18")
        )
    }

    fun getdataTerminal(): ArrayList<Terminal>{
        return arrayListOf(
            Terminal("1","Terminal Blok M","Blok M - Masjid Agung","30","Melawai, Kebayoran Baru, South Jakarta City, Jakarta",R.drawable.trans1),
            Terminal("2","Terminal Masjid Agung","Masjid Agung - Bundaran Senayan","22","Jl. Sisingamangaraja, RT.2/RW.1, Gunung, Kec. Kby. Baru, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12120",R.drawable.trans1),
            Terminal("3","Terminal Bundaran Senayan","Bundaran Senayan - Gelora Bung Karno","16","Bundaran Senayan",R.drawable.trans1),
            Terminal("4","Terminal Gelora Bung Karno","Gelora Bung Karno - Polda Metro Jaya","29","Jalan Jenderal Sudirman, Indonesia, Daerah Khusus Ibukota Jakarta",R.drawable.trans1),
            Terminal("5","Terminal Polda Metro Jaya","Polda Metro Jaya - Bendungan Hilir","36","Gelora, Tanah Abang, Central Jakarta City, Jakarta",R.drawable.trans1),
            Terminal("6","Terminal Bendungan Hlir","Bendungan Hilir - Karet Sudirman","84","Bendungan Hilir",R.drawable.trans1)
        )
    }
}