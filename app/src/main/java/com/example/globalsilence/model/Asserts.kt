package com.example.globalsilence.model

abstract class Asserts {
    open val name = ""
    open val length = 0
    open val deep = 0
    open val height = 0

    open var listOfAsserts = mutableListOf<Asserts?>()
    open var listOfParts = mutableListOf<Parts?>()
}