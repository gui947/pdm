package com.guilherme.app05

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Usuario(val nome: String, val idade: Int) : Parcelable
