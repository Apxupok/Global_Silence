package com.example.globalsilence.HS.model.interfaces.agregat

interface ISideAgregat {
    val section: Int
    val length:Int
    companion object {
        fun getSection(doors:Int,boxes:Int):Int{
            return doors + if (boxes%2==0){ boxes/2 } else boxes/3
        }
        fun getLengthForHS(section:Int):Int{
            val length = when (section){
                1 -> 980
                2 -> 1400
                3 -> 1810
                4 -> 2100
                else-> throw Exception("Нет таких корпусов")
            }
            return length
        }
        fun getLengthForCorpus(section:Int):Int{
            val length = when (section){
                1 -> 980-10
                2 -> 1400-10
                3 -> 1810-10
                4 -> 2100-10
                else-> throw Exception("Нет таких корпусов")
            }
            return length
        }
    }
}