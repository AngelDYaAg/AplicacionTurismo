package com.turismo.turismoguaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class paramo_subtropico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paramo_subtropico)
        val opcionClima: Int = intent.getIntExtra("tipo",1)
        val textViewTitulo: TextView = findViewById(R.id.textView8)
        val textViewDetalle: TextView = findViewById(R.id.textView9)
        if(opcionClima==1){
            textViewTitulo.text=getText(R.string.paramo_title)
            textViewDetalle.text=getText(R.string.paramo_detalle)
        }
        if(opcionClima==2){
            textViewTitulo.text=getText(R.string.subtropico_title)
            textViewDetalle.text=getText(R.string.subtropico_detalle)
        }
    }
}