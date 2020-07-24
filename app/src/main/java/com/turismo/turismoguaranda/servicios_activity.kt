package com.turismo.turismoguaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class servicios_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicios_activity)
        val opcion: Int = intent.getIntExtra("option",1)
        val imageViewServicios: ImageView = findViewById(R.id.imageView40)
        if(opcion==1){
            imageViewServicios.setImageResource(R.drawable.hosteria_angel_servicios)
        }
        if(opcion==2){
            imageViewServicios.setImageResource(R.drawable.hosteria_colina_servicios)
        }
        if(opcion==3){
            imageViewServicios.setImageResource(R.drawable.hosteria_rustica_servicios)
        }
        if(opcion==4){
            imageViewServicios.setImageResource(R.drawable.hosteria_cabana_servicios)
        }
    }
}