package com.example.globalsilence.viemodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HSViewModel: ViewModel() {
    var hsModel = MutableLiveData<List<Int>>()
    fun getHSList() = hsModel.value
}