package com.example.globalsilence.HS

import com.example.globalsilence.HS.corpus.Corpus
import com.example.globalsilence.HS.model.Asserts
import com.example.globalsilence.HS.model.interfaces.agregat.IBottomAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISideAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISmallAgregrat

class HS(doors: Int, boxes: Int, deep: Int, unit: String,mode:String): Asserts(), IBottomAgregat,
    ISideAgregat, ISmallAgregrat {
    override var length = 0
    override var section = 0
    override var height = 850
    override var name = ""

    var corpus = Corpus(0,0,0,0)

    var listOfAsserts = mutableListOf<Asserts>(corpus)
    init {
        when (unit) {
            "Боковое" -> {
                section = ISideAgregat.getSection(doors, boxes)
                length = ISideAgregat.getLengthForHS(section)
                name = when(mode){
                    "Среднетемпературный"->"CХС$doors$boxes"+"x$length"
                    else -> "НХС$doors$boxes"+"x$length"
                }
                corpus = Corpus(doors,boxes,deep-70,700)
            }
            "Нижнее" -> {
                section = IBottomAgregat.getSection(doors, boxes)
                length = IBottomAgregat.getLengthForHS(section)
                name = when(mode){
                    "Среднетемпературный"->"CХС$doors$boxes"+"x$length"
                    else -> "НХС$doors$boxes"+"x$length"
                }
                corpus = Corpus(doors,boxes,deep-70,485)

            }
            else->{throw Exception("Нет такого агрегата")}
        }
        listOfAsserts = mutableListOf<Asserts>(corpus)
    }



}

