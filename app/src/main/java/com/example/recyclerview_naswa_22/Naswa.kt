package com.example.recyclerview_naswa_22

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Naswa(
    val imgNaswa: Int,
    val nameNaswa: String,
    val descNaswa: String,
) : Parcelable
