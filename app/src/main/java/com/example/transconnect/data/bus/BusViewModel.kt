package com.example.transconnect.data.bus

import androidx.lifecycle.ViewModel
import com.example.transconnect.data.DataDummy

class BusViewModel : ViewModel() {

    fun getBus(): List<Bus> = DataDummy.getdataBus()
}