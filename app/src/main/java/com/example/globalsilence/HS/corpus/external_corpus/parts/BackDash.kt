package com.example.globalsilence.HS.corpus.external_corpus.parts

import com.example.globalsilence.HS.model.Parts

class BackDash(lengthP:Int,heighP:Int): Parts() {
    override var length: Int = lengthP
    override var height: Int = heighP
    override  var deep: Int = 20
    override var name: String = "Задняя стенка "

    init {

        when (lengthP){
            475 -> length = lengthP
            685 -> length = lengthP
            1125 -> length = lengthP
            1555-> length = lengthP

            480 -> length = lengthP
            900 -> length = lengthP
            1385 -> length = lengthP
            1800 -> length = lengthP
                //else -> throw Exception("Нет таких корпусов")
        }
        when (heighP){
            750-> height = heighP
            700-> height = heighP
        }
        name = "Задняя стенка $length"+"x$deep"+"x$height"
    }
}