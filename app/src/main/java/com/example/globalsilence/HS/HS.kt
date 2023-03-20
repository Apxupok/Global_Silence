package com.example.globalsilence.HS

import com.example.globalsilence.HS.corpus.Corpus
import com.example.globalsilence.HS.model.interfaces.agregat.IBottomAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISideAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISmallAgregrat

class HS(doors: Int, boxes: Int,height:Int, deep: Int, agregat: String): IBottomAgregat,
    ISideAgregat, ISmallAgregrat {

    val corpus = Corpus(doors,boxes,height,deep,agregat)
    override var length = 0
    override var section = 0
    init {
        when (agregat) {
            "Боковое" -> {
                section = ISideAgregat.getSection(doors, boxes)
                length = ISideAgregat.getLengthForHS(section)

            }
            "Нижнее" -> {
                section = IBottomAgregat.getSection(doors, boxes)
                length = IBottomAgregat.getLengthForHS(section)
            }
            "Малый" -> {
                section = ISmallAgregrat.getSection(doors, boxes)
                length = ISmallAgregrat.getLengthForCorpus(section)

            }
            else->{throw Exception("Нет такого агрегата")}
        }
    }

}

