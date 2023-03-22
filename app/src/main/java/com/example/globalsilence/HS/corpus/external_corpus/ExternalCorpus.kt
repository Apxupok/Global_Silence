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

    var sideDashL = SideDash(0,0,"левая")
    var sideDashR = SideDash(0,0,"правая")
    var beamVertical = if (section>1){BeamVertical(0,0)}else null
    var beamHorizontal = BeamHorizontal(0)
    var backDash = BackDash(0,0)

    var listOfParts = mutableListOf<Parts?>()

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
                if (section!=1){listOfParts.add(beamVertical)}

                sideDashL = SideDash(if (section>2){180}else{160},deep,"левая")
                listOfParts.add(sideDashL)

                sideDashR = SideDash(if (section>2){180}else{160},deep,"правая")
                listOfParts.add(sideDashR)

                beamHorizontal = BeamHorizontal(beamVertical?.length!! *section)
                listOfParts.add(beamHorizontal)

                backDash = BackDash(length-50*2,heightP)
                listOfParts.add(backDash)
            }
            485 -> {
                height = 485
                section = ISideAgregat.getSection(doors,boxes)
                length = ISideAgregat.getLengthForCorpus(section)

                beamVertical = BeamVertical(deep,700)
                if (section!=1){listOfParts.add(beamVertical)}

                sideDashL = SideDash(50,deep,"левая")
                listOfParts.add(sideDashL)

                sideDashR = SideDash(50,deep,"правая")
                listOfParts.add(sideDashR)

                beamHorizontal = BeamHorizontal(beamVertical?.length!!*section)
                listOfParts.add(beamHorizontal)

                backDash = BackDash(length-50*2,height)
                listOfParts.add(backDash)
            }
        }
    }

}
