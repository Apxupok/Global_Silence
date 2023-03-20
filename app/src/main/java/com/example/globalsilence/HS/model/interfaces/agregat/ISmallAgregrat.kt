package com.example.globalsilence.HS.model.interfaces.agregat

interface ISmallAgregrat {
    val section: Int
    companion object {
        fun getSection(doors:Int,boxes:Int):Int{
            return doors + boxes / 2
        }
        fun getLengthForHS(section:Int):Int{
            val length = when (section){
                1 -> 785
                2 -> 1200
                3 -> 1650
                4 -> 2060
                else-> throw Exception("Нет таких корпусов")
            }
            return length
        }
        fun getLengthForCorpus(section:Int):Int{
            val length = when (section){
                1 -> 785-10
                2 -> 1200-10
                3 -> 1650-10
                4 -> 2060-10
                else-> throw Exception("Нет таких корпусов")
            }
            return length
        }
    }
}