package com.turismo.turismoguaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView
import android.widget.TextView

class descripcion_minerales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descripcion_minerales)
        val opcionMineral: Int = intent.getIntExtra("option",1)
        val imageViewMineral: ImageView = findViewById(R.id.imageViewDescripcion)
        val textViewMineral: TextView = findViewById(R.id.textViewDescripcion)
        if(opcionMineral==1){
            imageViewMineral.setImageResource(R.drawable.mineral_cuarzo_cristal)
            textViewMineral.text=getText(R.string.cuarzo_cristal)
        }
        if(opcionMineral==2){
            imageViewMineral.setImageResource(R.drawable.mineral_amatista)
            textViewMineral.text=getText(R.string.amatista)

        }
        if(opcionMineral==3){
            imageViewMineral.setImageResource(R.drawable.mineral_citrino)
            textViewMineral.text=getText(R.string.citrino)
        }
        if(opcionMineral==4){
            imageViewMineral.setImageResource(R.drawable.mineral_malaquita)
            textViewMineral.text=getText(R.string.malaquita)
        }
        if(opcionMineral==5){
            imageViewMineral.setImageResource(R.drawable.mineral_cuarzo_ahumado)
            textViewMineral.text=getText(R.string.cuarzo_ahumado)
        }
        if(opcionMineral==6){
            imageViewMineral.setImageResource(R.drawable.mineral_cuarzo_rosado)
            textViewMineral.text=getText(R.string.cuarzo_rosado)
        }
        if(opcionMineral==7){
            imageViewMineral.setImageResource(R.drawable.mineral_rodocrosita)
            textViewMineral.text=getText(R.string.rodocrosita)
        }
        if(opcionMineral==8){
            imageViewMineral.setImageResource(R.drawable.mineral_turmalina)
            textViewMineral.text=getText(R.string.turmalina_negra)
        }
        if(opcionMineral==9){
            imageViewMineral.setImageResource(R.drawable.mineral_lapislazuli)
            textViewMineral.text=getText(R.string.lapislazuli)
        }
        if(opcionMineral==10){
            imageViewMineral.setImageResource(R.drawable.mineral_amazonita)
            textViewMineral.text=getText(R.string.amazonita)
        }
        if(opcionMineral==11){
            imageViewMineral.setImageResource(R.drawable.mineral_jaspe_rojo)
            textViewMineral.text=getText(R.string.jaspe_rojo)
        }
        if(opcionMineral==12){
            imageViewMineral.setImageResource(R.drawable.mineral_labradorita)
            textViewMineral.text=getText(R.string.labradorita)
        }
    }
}