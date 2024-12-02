package com.enaitzdam.appmvvmzero

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private var _nom = ""
    val nom: String
        get() = _nom

    private var _edat = ""
    val edat: String
        get() = _edat



}