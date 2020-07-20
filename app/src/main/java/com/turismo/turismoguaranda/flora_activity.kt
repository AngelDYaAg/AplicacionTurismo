package com.turismo.turismoguaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_flora_activity.*
import android.text.method.ScrollingMovementMethod
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class flora_activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flora_activity)
        val opcion: Int = intent.getIntExtra("option",1)
        val textViewTitulo: TextView = findViewById(R.id.textView2)
        val textViewDescripcion: TextView = findViewById(R.id.textView)
        textViewDescripcion.setMovementMethod(ScrollingMovementMethod())
        val imageViewPlanta: ImageView = findViewById(R.id.imageView22)
        if(opcion==1){
            textViewTitulo.text = getString(R.string.oreja_de_conejo)
            textViewDescripcion.text = getText(R.string.oreja_de_conejo_descripcion)
            imageViewPlanta.setImageResource(R.drawable.fotos_plantas01)
        }
        if(opcion==2){
            textViewTitulo.text = getString(R.string.salvia)
            textViewDescripcion.text = getText(R.string.salvia_descripcion)
            imageViewPlanta.setImageResource(R.drawable.fotos_plantas02)
        }
        if(opcion==3){
            textViewTitulo.text = getString(R.string.lupino)
            textViewDescripcion.text = getText(R.string.lupino_descripcion)
            imageViewPlanta.setImageResource(R.drawable.fotos_plantas03)
        }
        if(opcion==4){
            textViewTitulo.text = getString(R.string.mimosa_sensitiva)
            textViewDescripcion.text = getText(R.string.mimosa_sensitiva_descripcion)
            imageViewPlanta.setImageResource(R.drawable.fotos_plantas04)
        }
        if(opcion==5){
            textViewTitulo.text = getString(R.string.chilca)
            textViewDescripcion.text = getText(R.string.chilca_descripcion)
            imageViewPlanta.setImageResource(R.drawable.fotos_plantas05)
        }
        if(opcion==6){
            textViewTitulo.text = getString(R.string.retama)
            textViewDescripcion.text = getText(R.string.retama_descripcion)
            imageViewPlanta.setImageResource(R.drawable.fotos_plantas06)
        }
    }
}
