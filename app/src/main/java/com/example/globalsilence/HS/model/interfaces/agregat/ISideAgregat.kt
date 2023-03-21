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
                1 -> 970
                2 -> 1390
                3 -> 1800
                4 -> 2090
                else-> throw Exception("Нет таких корпусов")
            }
            return length
        }
    }
}