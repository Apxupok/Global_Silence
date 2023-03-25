package com.example.globalsilence.HS.corpus.external_corpus.parts

import com.example.globalsilence.model.Parts

class BeamVertical(lengthP: Int,heightP:Int): Parts() {
    override var length: Int = 0
    override var height: Int = 0
    override var name: String = ""
    override var deep: Int = 27

    init {
        when(lengthP){
            55-> length = 55
            65-> length = 65
            75-> length = 75
        }
        when(heightP){
            700-> height = heightP
            750-> height = heightP

        }
        name = "Перекладина вертикальная $length"+"x$deep"+"x$height"

    }


}