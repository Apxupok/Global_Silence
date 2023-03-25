package com.example.globalsilence.viemodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.globalsilence.model.HSModel

class HSViewModel: ViewModel() {
    var hsModel = MutableLiveData<List<Int>>()
    fun getHSList() = hsModel.value
}