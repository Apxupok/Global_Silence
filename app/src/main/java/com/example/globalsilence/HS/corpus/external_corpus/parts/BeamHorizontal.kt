package com.example.globalsilence.HS.corpus.external_corpus.parts

import com.example.globalsilence.HS.model.Parts

class BeamHorizontal(lengthP: Int):Parts() {
    override var length: Int = 0
    override var height: Int = 0
    override var name: String = ""
    init {
        when(lengthP){
            //Нижнее расположение
            480-> length = lengthP
            900-> length = lengthP
            1385-> length = lengthP
            1800-> length = lengthP
            //Боковое расположение
            365-> length = lengthP
            785-> length = lengthP
            860-> length = lengthP
            1655-> length = lengthP

        }
        name = "Перекладина горизонтальная $length"
    }


}