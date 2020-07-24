package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.turismo.turismoguaranda.adaptadores.*

class visor_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_activity)
        val i = intent
        val position = i.extras!!.getInt("id")
        val opcion = i.extras!!.getInt("option",5)
        if(opcion==1){
            val imageAdapter = galeria_angel_adaptador(this)
            val imageView = findViewById<View>(R.id.imagen_detalle) as ImageView
            imageView.setImageResource(imageAdapter.imagenesArray[position])
        }
        if(opcion==2){
            val imageAdapter = galeria_colina_adaptador(this)
            val imageView = findViewById<View>(R.id.imagen_detalle) as ImageView
            imageView.setImageResource(imageAdapter.imagenesArray[position])
        }
        if(opcion==3){
            val imageAdapter = galeria_rustica_adaptador(this)
            val imageView = findViewById<View>(R.id.imagen_detalle) as ImageView
            imageView.setImageResource(imageAdapter.imagenesArray[position])
        }
        if(opcion==4){
            val imageAdapter = galeria_cabana_adaptador(this)
            val imageView = findViewById<View>(R.id.imagen_detalle) as ImageView
            imageView.setImageResource(imageAdapter.imagenesArray[position])
        }
        if(opcion==5){
            val imageAdapter = galeria_adapter(this)
            val imageView = findViewById<View>(R.id.imagen_detalle) as ImageView
            imageView.setImageResource(imageAdapter.imagenesArray[position])
        }
    }
}
