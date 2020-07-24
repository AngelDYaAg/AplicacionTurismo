package com.turismo.turismoguaranda

import android.content.Intent
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
}