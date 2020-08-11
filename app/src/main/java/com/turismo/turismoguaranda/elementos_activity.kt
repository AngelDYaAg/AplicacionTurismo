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
        val textViewDescripcion: TextView = findViewById(R.id.textView4)
        textViewDescripcion.setMovementMethod(ScrollingMovementMethod())
        val imageViewElemento: ImageView = findViewById(R.id.imageView24)
        val imageViewColorElemento: ImageView = findViewById(R.id.imageView23)
        val airedetalle: TextView = findViewById(R.id.textView5)
        airedetalle.setMovementMethod(ScrollingMovementMethod())
        if(opcionElementos==1){
           // textViewTitulo.text = getString(R.string.aire_titulo)
            textViewDescripcion.text = getText(R.string.aire)
            airedetalle.text = getText(R.string.aire_detalle)
            imageViewElemento.setImageResource(R.drawable.flora_11)
            imageViewColorElemento.setImageResource(android.R.color.darker_gray)
        }
        if(opcionElementos==2){
           // textViewTitulo.text = getString(R.string.agua_titulo)
            textViewDescripcion.text = getText(R.string.agua)
            airedetalle.text = getText(R.string.agua_detalle)
            imageViewElemento.setImageResource(R.drawable.flora_09)
            imageViewColorElemento.setImageResource(android.R.color.holo_blue_light)
        }
        if(opcionElementos==3){
           // textViewTitulo.text = getString(R.string.fuego_titulo)
            textViewDescripcion.text = getText(R.string.fuego)
            airedetalle.text = getText(R.string.fuego_detalle)
            imageViewElemento.setImageResource(R.drawable.flora_02)
            imageViewColorElemento.setImageResource(android.R.color.holo_orange_light)
        }
        if(opcionElementos==4){
            //textViewTitulo.text = getString(R.string.tierra_titulo)
            textViewDescripcion.text = getText(R.string.tierra)
            airedetalle.text = getText(R.string.tierra_detalle)
            imageViewElemento.setImageResource(R.drawable.flora_10)
            imageViewColorElemento.setImageResource(android.R.color.holo_green_dark)
        }
    }
}
