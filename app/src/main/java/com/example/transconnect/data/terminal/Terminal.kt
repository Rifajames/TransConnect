package com.example.transconnect.data.terminal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Terminal (
    val terminalId: String,
    val terminalKoridor: String,
    val terminalroute: String,
    val terminalpassanger: String,
    val terminaladdress: String,
    val tImgSrc: Int
) : Parcelable