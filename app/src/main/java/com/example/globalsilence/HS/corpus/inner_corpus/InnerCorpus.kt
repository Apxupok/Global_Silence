package com.example.globalsilence.HS.corpus.inner_corpus

import com.example.globalsilence.HS.corpus.inner_corpus.parts.*
import com.example.globalsilence.model.Asserts
import com.example.globalsilence.model.Parts
import com.example.globalsilence.HS.agregat_interface.IBottomAgregat
import com.example.globalsilence.HS.agregat_interface.ISideAgregat
import com.example.globalsilence.HS.agregat_interface.ISmallAgregrat

class InnerCorpus(doors: Int, boxes: Int, heightP:Int, deepP: Int): Asserts(), IBottomAgregat,
    ISideAgregat, ISmallAgregrat {
    override var section = 0
    override var length = 0
    override var height = 0

    var sideDashL = SideDash(0, 0, "левая", 0)
    var sideDashR = SideDash(0, 0, "правая", 0)
    var beamVertical = if (section>1){
        BeamVertical(0,0) }else null
    var beamHorizontal = BeamHorizontal(0)
    var backDash = BackDash(0, 0)
    var bottom = Bottom(0,0)
    var panel = Panel(130,0)

    override var listOfParts = mutableListOf<Parts?>()
    init {
        when (heightP){
            660 -> {
                height = 660
                section = ISideAgregat.getSection(doors,boxes)
                length = ISideAgregat.getLengthForCorpus(section)-100

                beamVertical = BeamVertical(when(section){
                    2->55
                    3->65
                    4->75
                    else-> 0
                },660)
                if (section > 1){listOfParts.add(beamVertical!!)}

                sideDashL = SideDash(if (section>2){180}else{160},deepP,"левая",height)
                listOfParts.add(sideDashL)

                sideDashR = SideDash(if (section>2){180}else{160},deepP,"правая",height)
                listOfParts.add(sideDashR)

                beamHorizontal = BeamHorizontal(if (section > 1) { beamVertical?.length!! * section } else {365 })
                listOfParts.add(beamHorizontal)

                backDash = BackDash(length,height)
                listOfParts.add(backDash)

                bottom = Bottom(length,deepP)
                listOfParts.add(bottom)

                panel = Panel(130,height)
                listOfParts.add(panel)
            }

            445 -> {
                height = heightP
                section = ISideAgregat.getSection(doors,boxes)
                length = ISideAgregat.getLengthForCorpus(section)-100

                beamVertical = BeamVertical(deepP,445)
                if (section!=1){listOfParts.add(beamVertical!!)}

                sideDashL = SideDash(50,deepP,"левая",height)
                listOfParts.add(sideDashL)

                sideDashR = SideDash(50,deepP,"правая",height)
                listOfParts.add(sideDashR)

                beamHorizontal = BeamHorizontal(beamVertical!!.length*section)
                listOfParts.add(beamHorizontal)

                backDash = BackDash(length,height)
                listOfParts.add(backDash)

                bottom = Bottom(length,deepP)
                listOfParts.add(bottom)

                panel = Panel(130,height)
                listOfParts.add(panel)

            }
        }
    }

}