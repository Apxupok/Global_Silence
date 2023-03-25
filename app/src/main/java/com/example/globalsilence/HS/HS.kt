package com.example.globalsilence.HS

import com.example.globalsilence.HS.corpus.Corpus
import com.example.globalsilence.model.Asserts
import com.example.globalsilence.model.Parts
import com.example.globalsilence.HS.agregat_interface.IBottomAgregat
import com.example.globalsilence.HS.agregat_interface.ISideAgregat
import com.example.globalsilence.HS.agregat_interface.ISmallAgregrat
import com.example.globalsilence.HS.сountertop.Countertop

class HS(doors: Int, boxes: Int, deep: Int, unit: String,mode:String): Asserts(), IBottomAgregat,
    ISideAgregat, ISmallAgregrat {
    override var length = 0
    override var section = 0
    override var height = 850
    override var name = ""

    var corpus = Corpus(0,0,0,0)
    var panelOfControl = PanelOfControl()
    var countertop = Countertop()

    override var listOfAsserts = mutableListOf<Asserts?>()
    override var listOfParts = mutableListOf<Parts?>()
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
        listOfAsserts = mutableListOf<Asserts?>(corpus,countertop)
        listOfParts = mutableListOf<Parts?>(panelOfControl)
    }


    val HSIX40 = listOf(1,1,1,1)
    val HSIX32 = listOf(1,1,1,2)
    val HSIX33 = listOf(1,1,1,3)
    val HSIX24 = listOf(1,1,2,2)
    val HSIX25 = listOf(1,1,2,3)
    val HSIX26 = listOf(1,1,3,3)
    val HSIX16 = listOf(1,2,2,2)
    val HSIX17 = listOf(1,2,2,3)
    val HSIX18 = listOf(1,2,3,3)
    val HSIX19 = listOf(1,3,3,3)
    val HSIX08 = listOf(2,2,2,2)
    val HSIX010 = listOf(2,2,3,3)
    val HSIX011 = listOf(2,3,3,3)
    val HSIX012 = listOf(3,3,3,3)

    val HSIII30 = listOf(1,1,1)
    val HSIII22 = listOf(1,1,2)
    val HSIII23 = listOf(1,1,3)
    val HSIII14 = listOf(1,2,2)
    val HSIII15 = listOf(1,2,3)
    val HSIII16 = listOf(1,3,3)
    val HSIII07 = listOf(2,2,3)
    val HSIII08 = listOf(2,3,3)
    val HSIII09 = listOf(3,3,3)

    val HSII20 = listOf(1,1)
    val HSII12 = listOf(1,2)
    val HSII13 = listOf(1,3)
    val HSII04 = listOf(2,2)
    val HSII05 = listOf(2,3)
    val HSII06 = listOf(3,3)

    val HSI1 = listOf(1)
    val HSI02 = listOf(2)
    val HSI03 = listOf(3)

    //Нижнее расположение
    val HSnIX40 = listOf(1,1,1,1)
    val HSnIX32 = listOf(1,1,1,2)
    val HSInX24 = listOf(1,1,2,2)
    val HSInX16 = listOf(1,2,2,2)
    val HSInX08 = listOf(2,2,2,2)

    val HSnIII30 = listOf(1,1,1)
    val HSnIII22 = listOf(1,1,2)
    val HSnIII14 = listOf(1,2,2)
    val HSnIII06 = listOf(2,2,2)

    val HSnII20 = listOf(1,1)
    val HSnII12 = listOf(1,2)
    val HSnII04 = listOf(2,2)
    val HSnII05 = listOf(2,3)

    val HSnI1 = listOf(1)
    val HSnI02 = listOf(2)



}

