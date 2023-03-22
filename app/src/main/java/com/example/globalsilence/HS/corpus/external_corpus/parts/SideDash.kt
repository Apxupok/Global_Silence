package com.example.globalsilence.HS.corpus.external_corpus.parts

import com.example.globalsilence.HS.model.Parts

class SideDash(lengthP:Int, deepP:Int, side:String,heightP:Int):Parts() {
    override var length: Int = 0
    override var name: String = ""
    override var deep: Int = 0
    override var height: Int = 0
    init {
        when(deepP){
            430-> deep = deepP
            530-> deep = deepP
            630-> deep = deepP
            730-> deep = deepP
        }
        when(heightP){
            750-> height = heightP
            700-> height = heightP
        }
        when(side){
            "левая" -> length = 50
            "правая" -> {
                length = when(lengthP){
                    160 -> 160
                    180 -> 180
                    else-> {0}
                }
            }

        }
        name = "Боковая $side стенка $length"+"x$deep"+"x$height"
    }

}