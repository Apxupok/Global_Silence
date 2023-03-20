package com.example.globalsilence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.globalsilence.HS.HS
import com.example.globalsilence.HS.corpus.external_corpus.ExternalCorpus
import com.example.globalsilence.HS.corpus.external_corpus.parts.SideDash

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val text = findViewById<TextView>(R.id.textView)
        text.text = ""

    }
}