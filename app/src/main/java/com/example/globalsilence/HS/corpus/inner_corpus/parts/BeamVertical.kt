package com.example.globalsilence.HS.corpus.inner_corpus.parts

import com.example.globalsilence.data.Part

class BeamVertical(lengthP: Int,heightP:Int): Part() {
    override var length: Int = 0
    override var height: Int = 0
    override var name: String = ""
    override var deep: Int = 27

    init {
        when(lengthP){
            55-> length = lengthP
            65-> length = lengthP
            75-> length = lengthP
        }
        when(heightP){
            650-> height = heightP
            385-> height = heightP

        }
        name = "Перекладина вертикальная $length"+"x$deep"+"x$height"

    }


}