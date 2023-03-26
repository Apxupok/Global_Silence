package com.example.globalsilence.HS.corpus

import com.example.globalsilence.HS.corpus.external_corpus.ExternalCorpus
import com.example.globalsilence.HS.corpus.inner_corpus.InnerCorpus
import com.example.globalsilence.data.Assert
import com.example.globalsilence.HS.agregat_interface.IBottomAgregat
import com.example.globalsilence.HS.agregat_interface.ISideAgregat
import com.example.globalsilence.HS.agregat_interface.ISmallAgregrat
import com.example.globalsilence.data.Part


class Corpus(doors: Int, boxes: Int, deep: Int, heightP:Int): IBottomAgregat,
    ISideAgregat, ISmallAgregrat {
    override var section = 0
    override var length = 0
    override var height = heightP
    override var deep = 0

    override var listOfAsserts = mutableListOf<Assert?>()
    override var listOfParts = mutableListOf<Part?>()


    var externalCorpus:Assert? = null
    var innerCorpus:Assert? = null

    init {
        when (heightP) {
            //Боковое
            700 -> {
                section = ISideAgregat.getSection(doors, boxes)
                length = ISideAgregat.getLengthForCorpus(section)
                height = heightP

                val externalCorpusObj = ExternalCorpus(doors, boxes, height, deep)
                externalCorpus = Assert(
                    externalCorpusObj.name,
                    externalCorpusObj.length,
                    externalCorpusObj.deep,
                    externalCorpusObj.height,
                    externalCorpusObj
                )

                val innerCorpusObj = InnerCorpus(doors, boxes, height - 40, deep)
                innerCorpus = Assert(
                    innerCorpusObj.name,
                    innerCorpusObj.length,
                    innerCorpusObj.deep,
                    innerCorpusObj.height,
                    innerCorpusObj
                )

            }
            //Нижнее
            750 -> {
                section = IBottomAgregat.getSection(doors, boxes)
                length = IBottomAgregat.getLengthForCorpus(section)
                height = heightP

                val externalCorpusObj = ExternalCorpus(doors, boxes, height, deep)
                externalCorpus = Assert(
                    externalCorpusObj.name,
                    externalCorpusObj.length,
                    externalCorpusObj.deep,
                    externalCorpusObj.height,
                    externalCorpusObj
                )

                val innerCorpusObj = InnerCorpus(doors, boxes, height - 40, deep)
                innerCorpus = Assert(
                    innerCorpusObj.name,
                    innerCorpusObj.length,
                    innerCorpusObj.deep,
                    innerCorpusObj.height,
                    innerCorpusObj
                )
            }
            //else -> throw Exception("$heightP")
        }
    }
    override var name = "Корпус$doors$boxes"+" $length"+"x$deep"+"x$height"
}

