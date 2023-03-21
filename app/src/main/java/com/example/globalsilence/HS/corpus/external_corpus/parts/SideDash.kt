package com.example.globalsilence.HS.corpus.external_corpus.parts

import com.example.globalsilence.HS.model.Parts

class SideDash(lengthP:Int,deep:Int,side:String):Parts() {
    override var length: Int = 0

    init {
        when(deep){
            430-> name ="Перекладина на $deep"
            530-> name ="Перекладина на $deep"
            630-> name ="Перекладина на $deep"
            730-> name ="Перекладина на $deep"
        }
        when(side){
            "Левая" -> length = 50
            "Правая" -> {
                length = when(lengthP){
                    160 -> 160
                    180 -> 180
                    else-> {0}
                }
            }

        }
    }

}