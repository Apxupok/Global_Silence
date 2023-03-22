package com.example.globalsilence

import com.example.globalsilence.HS.HS


fun main() {
    val s2 = HS(1,0,500,"Боковое","Среднетемпературный")
    println(s2.section)
    (s2.corpus.externalCorpus.listOfParts.forEach{
        if (it != null) {
            println(it.name)
        }
    })

    (s2.corpus.innerCorpus.listOfParts.forEach{
        if (it != null) {
            println(it.name)
        }
    })

}