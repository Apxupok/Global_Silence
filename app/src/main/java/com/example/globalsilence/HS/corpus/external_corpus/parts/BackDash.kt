package com.example.globalsilence.HS.corpus.external_corpus.parts

import com.example.globalsilence.HS.model.Parts

class BackDash(lengthP:Int,heighP:Int): Parts() {
    override var length: Int = 0
    override var height: Int = 0
    override var name: String = ""

    init {
        when (lengthP){

        }
        when (heighP){
            485-> length = 485
            700-> length = 700
        }
        name = "$length$height"
    }
}