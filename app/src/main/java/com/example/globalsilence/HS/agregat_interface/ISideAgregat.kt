package com.example.globalsilence.HS.agregat_interface

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
                1 -> 575
                2 -> 785
                3 -> 1225
                4 -> 1655
                else-> throw Exception("Нет таких корпусов")
            }
            return length
        }
    }
}