package com.example.globalsilence

import com.example.globalsilence.HS.HS
import com.example.globalsilence.HS.corpus.Corpus
import com.example.globalsilence.HS.corpus.external_corpus.ExternalCorpus
import java.util.*

fun main() {
    val s2 = HS(2,5,850,500,"Боковое")
    println(s2.section)
    println(s2.corpus.externalCorpus.beamVertical.length)
}