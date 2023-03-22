package com.example.globalsilence.HS.corpus

import com.example.globalsilence.HS.corpus.external_corpus.ExternalCorpus
import com.example.globalsilence.HS.corpus.inner_corpus.InnerCorpus
import com.example.globalsilence.HS.model.Asserts
import com.example.globalsilence.HS.model.interfaces.agregat.IBottomAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISideAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISmallAgregrat



class Corpus(doors: Int, boxes: Int, deep: Int, heightP:Int): Asserts(), IBottomAgregat,
    ISideAgregat, ISmallAgregrat {
    override var section = 0
    override var length = 0
    override var height = 0


    var externalCorpus = ExternalCorpus(0, 0, 0, 0)
    var innerCorpus = InnerCorpus(0, 0, 0, 0)

    init {
        when (heightP) {
            //Боковое
            700 -> {
                section = ISideAgregat.getSection(doors, boxes)
                length = ISideAgregat.getLengthForCorpus(section)
                height = heightP
                externalCorpus = ExternalCorpus(doors, boxes, height, deep)
                innerCorpus = InnerCorpus(doors, boxes, height - 40, deep)

            }
            //Нижнее
            750 -> {
                section = IBottomAgregat.getSection(doors, boxes)
                length = IBottomAgregat.getLengthForCorpus(section)
                height = heightP
                externalCorpus = ExternalCorpus(doors, boxes, height, deep)
                innerCorpus = InnerCorpus(doors, boxes, 445, deep)
            }
            //else -> throw Exception("$heightP")
        }
    }
    override val name = "Корпус$doors$boxes"+"x$length"
}

