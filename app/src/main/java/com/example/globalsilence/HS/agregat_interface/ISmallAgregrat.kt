package com.example.globalsilence.HS.agregat_interface

import com.example.globalsilence.data.Assert
import com.example.globalsilence.data.Part

interface ISmallAgregrat {
    var name: String
    var length : Int
    var section :Int
    var height : Int
    var deep : Int

    var listOfAsserts: MutableList<Assert?>
    var listOfParts : MutableList<Part?>
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