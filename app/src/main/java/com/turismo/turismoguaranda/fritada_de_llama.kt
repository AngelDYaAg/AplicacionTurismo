package com.turismo.turismoguaranda

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class fritada_de_llama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proteina_fritada_activity)
        val clase: Int = intent.getIntExtra("clase",1)
        val comida: Int = intent.getIntExtra("comida",1)
        val imageViewComida: ImageView = findViewById(R.id.imageView31)
        if (clase==1&&comida==1){
            imageViewComida.setImageResource(R.drawable.fritada_de_llama)
        }
        if (clase==1&&comida==2){
            imageViewComida.setImageResource(R.drawable.sancocho_de_campeche)
        }
        if (clase==2&&comida==1){
            imageViewComida.setImageResource(R.drawable.chiguiles01)
        }
        if (clase==2&&comida==2){
            imageViewComida.setImageResource(R.drawable.chicha)
        }
        if (clase==3&&comida==1){
            imageViewComida.setImageResource(R.drawable.dulce_de_oca)
        }
        if (clase==3&&comida==2){
            imageViewComida.setImageResource(R.drawable.papa_china)
        }
    }

    fun onclick_proteina_ingredientes (view: View){
        val intento = Intent(this,ingredientes_activity::class.java)
        intento.putExtra("clase",intent.getIntExtra("clase",1))
        intento.putExtra("comida",intent.getIntExtra("comida",1))
        startActivity(intento)

    }
    fun onclick_proteina_valor_nutricional (view: View){
        val intento = Intent(this,valor_nutricional_activity::class.java)
        intento.putExtra("clase",intent.getIntExtra("clase",1))
        intento.putExtra("comida",intent.getIntExtra("comida",1))
        startActivity(intento)

    }
    fun onclick_como_llegar (view: View){
        val clase: Int = intent.getIntExtra("clase",1)
        val comida: Int = intent.getIntExtra("comida",1)
        if (clase==1&&comida==1){
            val gmmIntentUri = Uri.parse("geo:-1.5920101,-79.001913?q=-1.5920101,-79.001913")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (clase==1&&comida==2){
            val gmmIntentUri = Uri.parse("geo:-1.588313,-79.0068564?q=-1.588313,-79.0068564")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (clase==2&&comida==1){
            val gmmIntentUri = Uri.parse("geo:-1.5939408,-79.0043797?q=-1.5939408,-79.0043797")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (clase==2&&comida==2){
            val gmmIntentUri = Uri.parse("geo:-1.5939408,-79.0043797?q=-1.5939408,-79.0043797")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (clase==3&&comida==1){
            val gmmIntentUri = Uri.parse("geo:-1.5939408,-79.0043797?q=-1.5939408,-79.0043797")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (clase==3&&comida==2){
            val gmmIntentUri = Uri.parse("geo:-1.5935832,-79.0003526?q=-1.5935832,-79.0003526")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
    }



}