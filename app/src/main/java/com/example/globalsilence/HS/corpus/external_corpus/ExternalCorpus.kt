package com.example.globalsilence.HS.corpus.external_corpus


import com.example.globalsilence.HS.corpus.external_corpus.parts.BackDash
import com.example.globalsilence.HS.corpus.external_corpus.parts.BeamHorizontal
import com.example.globalsilence.HS.corpus.external_corpus.parts.BeamVertical
import com.example.globalsilence.HS.corpus.external_corpus.parts.SideDash
import com.example.globalsilence.HS.model.Asserts
import com.example.globalsilence.HS.model.Parts
import com.example.globalsilence.HS.model.interfaces.agregat.IBottomAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISideAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISmallAgregrat


class ExternalCorpus(doors: Int, boxes: Int, heightP:Int, deep: Int): Asserts(), IBottomAgregat,
    ISideAgregat, ISmallAgregrat {

    override var section = 0
    override var length = 0
    override var height = 0

    var sideDashL = SideDash(0,0,"Левая")
    var sideDashR = SideDash(0,0,"Правая")
    var beamVertical = BeamVertical(0,0)
    var beamHorizontal = BeamHorizontal(0)
    var backDash = BackDash(0,0)

    var listOfDetails = mutableListOf<Parts>(sideDashL,sideDashR,beamHorizontal,beamVertical)

    init {
        when (heightP){
            700 -> {
                height = 700
                section = ISideAgregat.getSection(doors,boxes)
                length = ISideAgregat.getLengthForCorpus(section)

                beamVertical = BeamVertical(when(section){
                    2->55
                    3->65
                    4->75
                    else-> 0
                },700)
                sideDashL = SideDash(if (section>2){180}else{160},deep-70,"Левая")
                sideDashR = SideDash(if (section>2){180}else{160},deep-70,"Правая")
                beamHorizontal = BeamHorizontal(beamVertical.length*section)
                backDash = BackDash(length-50*2,heightP)
            }
            485 -> {
                height = 485
                section = ISideAgregat.getSection(doors,boxes)
                length = ISideAgregat.getLengthForCorpus(section)

                beamVertical = BeamVertical(deep,700)
                sideDashL = SideDash(50,deep-70,"Левая")
                sideDashR = SideDash(50,deep-70,"Правая")
                beamHorizontal = BeamHorizontal(beamVertical.length*section)
                backDash = BackDash(length-50*2,height)
            }
        }
    }

}
