package com.example.globalsilence.HS.model

abstract class Asserts {
    open val name = ""
    open var listOfAsserts = mutableListOf<Asserts?>()
    open var listOfParts = mutableListOf<Parts?>()
}