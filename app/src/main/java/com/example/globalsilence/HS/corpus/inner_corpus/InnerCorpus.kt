package com.example.globalsilence.HS.corpus.inner_corpus

import com.example.globalsilence.HS.model.AssertsOfCorpus
import com.example.globalsilence.HS.model.interfaces.agregat.IBottomAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISideAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISmallAgregrat

class InnerCorpus(doors: Int, boxes: Int,height:Int, deep: Int, agregat: String):IBottomAgregat,ISideAgregat,ISmallAgregrat {
    override var section = 0
    override var length = 0
}