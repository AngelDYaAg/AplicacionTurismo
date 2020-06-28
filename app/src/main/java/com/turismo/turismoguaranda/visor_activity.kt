package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.turismo.turismoguaranda.adaptadores.galeria_adapter

class visor_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_activity)
        val i = intent
        val position = i.extras!!.getInt("id")
        val imageAdapter = galeria_adapter(this)
        val imageView = findViewById<View>(R.id.imagen_detalle) as ImageView
        imageView.setImageResource(imageAdapter.imagenesArray[position])

    }
}
