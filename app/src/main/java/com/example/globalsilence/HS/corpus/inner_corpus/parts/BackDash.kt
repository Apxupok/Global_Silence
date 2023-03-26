package com.example.globalsilence.HS.corpus.inner_corpus.parts

import com.example.globalsilence.data.Part

class BackDash(lengthP:Int,heighP:Int): Part() {

        override var length: Int = 0
        override var height: Int = 10
        override var deep: Int = 20
        override var name: String = ""

        init {

            when (lengthP) {
                //Для бокового
                475 -> length = lengthP
                685 -> length = lengthP
                1125 -> length = lengthP
                1555 -> length = lengthP

                //Для нижнего
                480 -> length = lengthP
                900 -> length = lengthP
                1385 -> length = lengthP
                1800 -> length = lengthP
                //else -> throw Exception("Нет таких корпусов")
            }
            when (heighP) {
                435 -> height = heighP
                650 -> height = heighP
            }
            name = "Задняя стенка $length"+"x$deep"+"x$height"


    }
}