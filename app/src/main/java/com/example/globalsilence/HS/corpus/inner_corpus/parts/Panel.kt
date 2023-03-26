package com.example.globalsilence.HS.corpus.inner_corpus.parts

import com.example.globalsilence.data.Part

class Panel(lengthP:Int, heightP:Int): Part() {
    override var length: Int = lengthP
    override var deep: Int = 25
    override var height: Int = heightP
    override var name: String = "Панель $length"+"x$deep"+"x$height"

}