package com.example.transconnect

import com.example.transconnect.data.bus.Bus

interface DataCallback {
    fun onItemClicked(data: Bus)
}