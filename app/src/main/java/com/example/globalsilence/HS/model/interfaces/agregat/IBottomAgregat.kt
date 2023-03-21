package com.example.globalsilence.HS.model.interfaces.agregat

interface IBottomAgregat {
    val section: Int
    val length:Int
    val height: Int
    companion object {
        fun getSection(doors: Int, boxes: Int): Int {
            return doors + if (boxes%2==0){ boxes/2 } else boxes/3
        }
        fun getLengthForHS(section:Int):Int{
            val length = when (section) {
                1 -> 580
                2 -> 1000
                3 -> 1485
                4 -> 1900
                else -> throw Exception("Нет таких корпусов")
            }
            return length
        }
        fun getLengthForCorpus(section:Int):Int{
            val length = when (section) {
                1 -> 580 - 5
                2 -> 1000 - 5
                3 -> 1485 - 5
                4 -> 1900 - 5
                else -> throw Exception("Нет таких корпусов")
            }
            return length
        }

    }
}