package com.example.globalsilence.HS.corpus.inner_corpus.parts

import com.example.globalsilence.model.Parts

class SideDash(lengthP:Int, deepP:Int, side:String,heightP:Int): Parts() {
    override var length: Int = 0
    override var name: String = ""
    override var deep: Int = 0
    override var height: Int = 0
    init {
        when(deepP){
            330-> deep = deepP
            430-> deep = deepP
            530-> deep = deepP
            630-> deep = deepP
        }
        when(heightP){
            660-> height = heightP
            445-> height = heightP
        }
        when(side){
            "левая" -> length = 10
            "правая" -> length = 10

        }
        name = "Боковая $side стенка $length"+"x$deep"+"x$height"
    }

}