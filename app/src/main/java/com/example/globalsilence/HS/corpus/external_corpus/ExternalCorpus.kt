package com.example.globalsilence.HS.corpus.external_corpus


import com.example.globalsilence.HS.corpus.external_corpus.parts.BeamHorizontal
import com.example.globalsilence.HS.corpus.external_corpus.parts.BeamVertical
import com.example.globalsilence.HS.corpus.external_corpus.parts.SideDash
import com.example.globalsilence.HS.model.interfaces.agregat.IBottomAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISideAgregat
import com.example.globalsilence.HS.model.interfaces.agregat.ISmallAgregrat


class ExternalCorpus(doors: Int, boxes: Int, height:Int, deep: Int, agregat: String): IBottomAgregat,
    ISideAgregat, ISmallAgregrat {

    override var section = 0
    override var length = 0

    var sideDashL = SideDash(deep,height)
    var sideDashR = SideDash(deep,height)
    var beamVertical = BeamVertical(0)
    var beamHorizontal = BeamHorizontal(0)

    init {
        when (agregat){
            "Боковое" -> {
                section = ISideAgregat.getSection(doors,boxes)
                length = ISideAgregat.getLengthForCorpus(section)
                beamVertical = BeamVertical(when(section){
                    2->55
                    3->65
                    4->75
                    else-> 0
                })
                beamHorizontal = BeamHorizontal(length-50*2)
                sideDashL = SideDash(deep,height)
                sideDashR = SideDash(deep,height)
            }
            "Нижнее" -> {
                section = ISideAgregat.getSection(doors,boxes)
                length = ISideAgregat.getLengthForCorpus(section)
                beamVertical = BeamVertical(0)
                sideDashL = SideDash(deep,height)
                sideDashR = SideDash(deep,height)
            }
            "Малый" -> {
                section = ISideAgregat.getSection(doors,boxes)
                length = ISideAgregat.getLengthForCorpus(section)
                beamVertical = BeamVertical(when(section) {
                    2 -> 55
                    3 -> 65
                    4 -> 75
                    else -> 0
                })
                sideDashL = SideDash(deep,height)
                sideDashR = SideDash(deep,height)
            }

            else -> throw java.lang.Exception("loh")
        }
    }




}
