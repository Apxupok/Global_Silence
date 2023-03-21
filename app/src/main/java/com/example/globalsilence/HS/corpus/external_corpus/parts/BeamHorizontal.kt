package com.example.globalsilence.HS.corpus.external_corpus.parts

import com.example.globalsilence.HS.model.Parts

class BeamHorizontal(val lengthP: Int):Parts() {
    override var name = ""
    init {
        when(lengthP){
            //Нижнее расположение
            480-> name ="Перекладина на $lengthP"
            900-> name ="Перекладина на $lengthP"
            1385-> name ="Перекладина на $lengthP"
            1800-> name ="Перекладина на $lengthP"
            //Боковое расположение
            365-> name ="Перекладина на $lengthP"
            785-> name ="Перекладина на $lengthP"
            860-> name ="Перекладина на $lengthP"
            1655-> name ="Перекладина на $lengthP"
            else -> {"new"}
        }
    }


}