package com.example.globalsilence.HS.corpus.external_corpus.parts

import com.example.globalsilence.data.Part

class BeamHorizontal(lengthP: Int): Part() {
    override var length: Int = 0
    override var height: Int = 50
    override var name: String = ""
    override var deep: Int = 27

    init {
        when(lengthP){
            //Нижнее расположение
            480-> {
                length = lengthP
                height = 700}
            900->  {
                length = lengthP
                height = 700}
            1385->  {
                length = lengthP
                height = 700}
            1800->  {
                length = lengthP
                height = 700}
            //Боковое расположение
            365->  {
                length = lengthP
                height = 475}
            785-> {
                length = lengthP
                height = 475}
            860-> {
                length = lengthP
                height = 475}
            1655-> {
                length = lengthP
                height = 475}

        }

        name = "Перекладина горизонтальная $length"+"x$deep"+"x$height"
    }


}