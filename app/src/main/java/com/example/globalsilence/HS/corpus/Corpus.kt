package com.example.globalsilence.HS.corpus

import com.example.globalsilence.HS.corpus.external_corpus.ExternalCorpus
import com.example.globalsilence.HS.corpus.inner_corpus.InnerCorpus
import com.example.globalsilence.HS.model.interfaces.agregat.IBottomAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISideAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISmallAgregrat



class Corpus(doors: Int, boxes: Int, height:Int, deep: Int, agregat:String): IBottomAgregat,
    ISideAgregat, ISmallAgregrat {

    override var section = 0
    override var length = 0

    val externalCorpus = ExternalCorpus(doors, boxes, height, deep, agregat)
    val innerCorpus = InnerCorpus(doors, boxes, height - 100, deep - 100, agregat)

    init {
        when (agregat) {
            "Боковое" -> {
                section = ISideAgregat.getSection(doors, boxes)
                length = ISideAgregat.getLengthForCorpus(section)
            }
            "Нижнее" -> {
                section = IBottomAgregat.getSection(doors, boxes)
                length = IBottomAgregat.getLengthForCorpus(section)
            }
            "Малый" -> {
                section = IBottomAgregat.getSection(doors, boxes)
                length = ISmallAgregrat.getLengthForCorpus(section)
            }
            else -> throw Exception("Нет агрегатов")
        }
    }
}

