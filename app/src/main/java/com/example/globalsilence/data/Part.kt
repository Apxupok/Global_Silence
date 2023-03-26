package com.example.globalsilence.data

abstract class Part
{
    open var length:Int = 0
        get() {
            return field
        }
    open var height:Int = 0
        get() {
            return field
        }
    open var width:Int = 0
        get() {
            return field
        }
    open var name:String = ""
        get() {
            return field
        }
    open var deep:Int = 0
        get() {
            return field
        }
    open lateinit var arrayProp:Array<Int>
}