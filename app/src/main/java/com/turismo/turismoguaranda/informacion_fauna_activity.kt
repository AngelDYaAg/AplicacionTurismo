package com.turismo.turismoguaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView
import android.widget.TextView

class informacion_fauna_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_fauna_activity)
        val clase: Int = intent.getIntExtra("clase",1)
        val animal: Int = intent.getIntExtra("animal",1)
        val textViewDescripcion: TextView = findViewById(R.id.textView6)
        textViewDescripcion.setMovementMethod(ScrollingMovementMethod())
        val imageViewAnimal: ImageView = findViewById(R.id.imageView5)
        if (clase==1&&animal==1){
            imageViewAnimal.setImageResource(R.drawable.volador_nombre_curiquingue)
            textViewDescripcion.text=getText(R.string.curiquingues)
        }else
        if (clase==1&&animal==2){
            imageViewAnimal.setImageResource(R.drawable.volador_nombre_gallo)
            textViewDescripcion.text=getText(R.string.gallo_de_la_pena)
        }else
        if (clase==1&&animal==3){
            imageViewAnimal.setImageResource(R.drawable.volador_nombre_gavilan)
            textViewDescripcion.text=getText(R.string.gavilan)
        }else
        if (clase==1&&animal==4){
            imageViewAnimal.setImageResource(R.drawable.volador_nombre_mirlo)
            textViewDescripcion.text=getText(R.string.mirlo)
        }else
        if (clase==2&&animal==1){
            imageViewAnimal.setImageResource(R.drawable.terrestres_nombre_chucuri)
            textViewDescripcion.text=getText(R.string.chucuri)
        }else
        if (clase==2&&animal==2){
            imageViewAnimal.setImageResource(R.drawable.terrestres_nombre_cusumbo)
            textViewDescripcion.text=getText(R.string.cusumbo)
        }else
        if (clase==2&&animal==3){
            imageViewAnimal.setImageResource(R.drawable.terrestres_nombre_guanta)
            textViewDescripcion.text=getText(R.string.guanta)
        }else
        if (clase==2&&animal==4){
            imageViewAnimal.setImageResource(R.drawable.terrestres_nombre_vicuna)
            textViewDescripcion.text=getText(R.string.vicuna)
        }else
        if (clase==3&&animal==1){
            imageViewAnimal.setImageResource(R.drawable.rastreros_nombre_lagartija)
            textViewDescripcion.text=getText(R.string.lagartija)
        }else
        if (clase==3&&animal==2){
            imageViewAnimal.setImageResource(R.drawable.rastreros_nombre_raton)
            textViewDescripcion.text=getText(R.string.raton_de_paramo)
        }else
        if (clase==3&&animal==3){
            imageViewAnimal.setImageResource(R.drawable.rastreros_nombre_serpiente)
            textViewDescripcion.text=getText(R.string.serpiente)
        }else
        if (clase==3&&animal==4){
            imageViewAnimal.setImageResource(R.drawable.rastreros_nombre_zorrillo)
            textViewDescripcion.text=getText(R.string.zorrillo)
        }
    }
}