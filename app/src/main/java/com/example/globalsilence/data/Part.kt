package com.example.globalsilence.data

abstract class Part
{
    open var length:Int = 0
    open var height:Int = 0
    open var width:Int = 0
    open var name:String = ""
    open var deep:Int = 0

    open lateinit var arrayProp:Array<Int>
}