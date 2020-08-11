package com.turismo.turismoguaranda

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class lugares_turisticos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lugares_turisticos)
        val opcion: Int = intent.getIntExtra("option",1)
        val imageViewLugar: ImageView = findViewById(R.id.imageView14)
        val textViewLugar: TextView = findViewById(R.id.textView3)
        if (opcion==1){
            imageViewLugar.setImageResource(R.drawable.siete_colinas_1)
            textViewLugar.text = getText(R.string.colinas_7)
        }
        if (opcion==2){
            imageViewLugar.setImageResource(R.drawable.indio_guaranga_2)
            textViewLugar.text = getText(R.string.indio_guaranga)
        }
        if (opcion==3){
            imageViewLugar.setImageResource(R.drawable.parque_central_3)
            textViewLugar.text = getText(R.string.parque_central)
        }
        if (opcion==4){
            imageViewLugar.setImageResource(R.drawable.la_guitarra_4)
            textViewLugar.text = getText(R.string.la_guitarra)
        }
        if (opcion==5){
            imageViewLugar.setImageResource(R.drawable.las_cochas_5)
            textViewLugar.text = getText(R.string.laguna_las_cochas)
        }
        if (opcion==6){
            imageViewLugar.setImageResource(R.drawable.gad_guaranda_6)
            textViewLugar.text = getText(R.string.municipio)
        }
        if (opcion==7){
            imageViewLugar.setImageResource(R.drawable.santuario_7)
            textViewLugar.text = getText(R.string.santuario)
        }
        if (opcion==8){
            imageViewLugar.setImageResource(R.drawable.plaza_carnaval_8)
            textViewLugar.text = getText(R.string.plaza_del_carnaval)
        }
    }

    fun onclick_panoramica (view: View){
        val opcion: Int = intent.getIntExtra("option",1)
        if (opcion==1){
            val gmmIntentUri = Uri.parse("google.streetview:cbll=-1.5972546,-79.005661")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (opcion==2){
            val gmmIntentUri = Uri.parse("google.streetview:cbll=-1.588313,-79.0068564")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (opcion==3){
            val gmmIntentUri = Uri.parse("google.streetview:cbll=-1.5922487,-79.0016757")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (opcion==4){
            val gmmIntentUri = Uri.parse("google.streetview:cbll=-1.5981938,-79.0060189")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (opcion==5){
            val gmmIntentUri = Uri.parse("google.streetview:cbll=-1.5443283,-78.9803757")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (opcion==6){
            val gmmIntentUri = Uri.parse("google.streetview:cbll=-1.5920757,-79.0011007")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (opcion==7){
            val gmmIntentUri = Uri.parse("google.streetview:cbll=")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (opcion==8){
            val gmmIntentUri = Uri.parse("google.streetview:cbll=-1.5971264,-79.0025612")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }

        //val intent = Intent(this,MapsActivity::class.java);
        //startActivity(intent);
    }
}