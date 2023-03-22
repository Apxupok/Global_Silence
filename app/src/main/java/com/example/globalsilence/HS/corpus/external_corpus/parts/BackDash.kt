package com.example.globalsilence.HS.corpus.external_corpus.parts

import com.example.globalsilence.HS.model.Parts

class BackDash(lengthP:Int,heighP:Int): Parts() {
    override var length: Int = lengthP
    override var height: Int = heighP
    override  var deep: Int = 20
    override var name: String = "Задняя стенка "

    init {

        when (lengthP){
            475 -> name += lengthP
            685 -> name += lengthP
            1125 -> name += lengthP
            1555-> name += lengthP

            480 -> name += lengthP
            900 -> name += lengthP
            1385 -> name += lengthP
            1800 -> name += lengthP
                //else -> throw Exception("Нет таких корпусов")
        }
        name+="x$deep"+"x"
        when (heighP){
            485-> name += 485
            700-> name += 700
        }

    }
}