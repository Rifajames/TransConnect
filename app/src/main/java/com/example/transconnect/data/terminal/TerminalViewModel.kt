package com.example.transconnect.data.terminal

import androidx.lifecycle.ViewModel
import com.example.transconnect.data.DataDummy

class TerminalViewModel : ViewModel() {

    fun getTerminal(): List<Terminal> = DataDummy.getdataTerminal()
}