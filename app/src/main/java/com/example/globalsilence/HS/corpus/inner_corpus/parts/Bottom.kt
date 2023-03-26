package com.example.globalsilence.HS.corpus.inner_corpus.parts


import com.example.globalsilence.data.Part



class Bottom(lengthP: Int,deepP: Int): Part() {
    override var length: Int = lengthP
    override var deep: Int = 25
    override var height: Int = 10
    override var name: String = "Дно $length"+"x$deep"+"x$height"

}