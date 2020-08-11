package com.turismo.turismoguaranda

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class hotel_inicio_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_inicio_activity)
        val opcion: Int = intent.getIntExtra("option",1)
        val imageViewHotel: ImageView = findViewById(R.id.imageView39)
        if(opcion==1){
            imageViewHotel.setImageResource(R.drawable.hosteria_angel_inicio)
        }
        if(opcion==2){
            imageViewHotel.setImageResource(R.drawable.hosteria_colina_inicio)
        }
        if(opcion==3){
            imageViewHotel.setImageResource(R.drawable.hosteria_rustica_inicio)
        }
        if(opcion==4){
            imageViewHotel.setImageResource(R.drawable.hosteria_cabana_inicio)
        }
    }

    fun onclick_servicios (view: View){
        val intento = Intent(this,servicios_activity::class.java)
        intento.putExtra("option",intent.getIntExtra("option",1))
        startActivity(intento)
    }

    fun onclick_galeria (view: View){
        val intento = Intent(this,galeria_activity::class.java)
        intento.putExtra("option",intent.getIntExtra("option",1))
        startActivity(intento)
    }

    fun onclick_como_llegar (view: View) {
        val opcion: Int = intent.getIntExtra("option",1)
        if (opcion == 1) {
            val gmmIntentUri = Uri.parse("geo:-1.6028255,-78.9883049?q=-1.6028255,-78.9883049")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (opcion == 2) {
            val gmmIntentUri = Uri.parse("geo:-1.5881929,-78.9954919?q=-1.5881929,-78.9954919")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (opcion == 3) {
            val gmmIntentUri = Uri.parse("geo:-1.6022253,-79.0042439?q=-1.6022253,-79.0042439")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
        if (opcion == 4) {
            val gmmIntentUri = Uri.parse("geo:-1.5867979,-79.0011045?q=-1.5867979,-79.0011045")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }
    }

    fun onclick_reservaciones (view: View) {
        val opcion: Int = intent.getIntExtra("option",1)
        if (opcion == 1) {
            val gmmIntentUri = Uri.parse("https://www.tripadvisor.co/Hotel_Review-g2642506-d2625930-Reviews-Hosteria_El_Angel-Guaranda_Bolivar_Province.html")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            startActivity(mapIntent)
        }
        if (opcion == 2) {
            val gmmIntentUri = Uri.parse("https://www.tripadvisor.co/Hotel_Review-g2642506-d3736866-Reviews-Hotel_La_Colina-Guaranda_Bolivar_Province.html")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            startActivity(mapIntent)
        }
        if (opcion == 3) {
            val gmmIntentUri = Uri.parse("https://www.tripadvisor.co/Hotel_Review-g2642506-d10752195-Reviews-La_Rustica_Hostal-Guaranda_Bolivar_Province.html")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            startActivity(mapIntent)
        }
        if (opcion == 4) {
            val gmmIntentUri = Uri.parse("https://es.airbnb.com/rooms/19680163?source_impression_id=p3_1595057226_02SXpDTrxI3W97wM&guests=1&adults=1")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            startActivity(mapIntent)
        }
    }
}