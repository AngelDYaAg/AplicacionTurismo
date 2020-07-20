package com.turismo.turismoguaranda

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView
import android.widget.TextView

class elementos_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elementos_activity)

        val opcionElementos: Int = intent.getIntExtra("optionElemento",1)
        val textViewTitulo: TextView = findViewById(R.id.textView3)
        val textViewDescripcion: TextView = findViewById(R.id.textView4)
        textViewDescripcion.setMovementMethod(ScrollingMovementMethod())
        val imageViewElemento: ImageView = findViewById(R.id.imageView24)
        val imageViewColorElemento: ImageView = findViewById(R.id.imageView23)
        if(opcionElementos==1){
            textViewTitulo.text = getString(R.string.aire_titulo)
            textViewDescripcion.text = getText(R.string.aire)
            imageViewElemento.setImageResource(R.drawable.aire)
            imageViewColorElemento.setImageResource(android.R.color.darker_gray)
        }
        if(opcionElementos==2){
            textViewTitulo.text = getString(R.string.agua_titulo)
            textViewDescripcion.text = getText(R.string.agua)
            imageViewElemento.setImageResource(R.drawable.agua)
            imageViewColorElemento.setImageResource(android.R.color.holo_blue_light)
        }
        if(opcionElementos==3){
            textViewTitulo.text = getString(R.string.fuego_titulo)
            textViewDescripcion.text = getText(R.string.fuego)
            imageViewElemento.setImageResource(R.drawable.fuego)
            imageViewColorElemento.setImageResource(android.R.color.holo_orange_light)
        }
        if(opcionElementos==4){
            textViewTitulo.text = getString(R.string.tierra_titulo)
            textViewDescripcion.text = getText(R.string.tierra)
            imageViewElemento.setImageResource(R.drawable.tierra)
            imageViewColorElemento.setImageResource(android.R.color.holo_green_dark)
        }
    }
}
