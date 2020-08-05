package com.turismo.turismoguaranda

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class bienvenida_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida_activity)
    }

    fun onclick_galeria (view: View){
        val intent = Intent(this,galeria_activity::class.java);
        intent.putExtra("option",5)
        startActivity(intent);
    }

    fun onclick_naturaleza (view: View){
        val intent = Intent(this,menu_naturaleza_activity::class.java);
        startActivity(intent);
    }
    fun onclick_comida (view: View){
        val intent = Intent(this,comida_activity::class.java);
        startActivity(intent);
    }

    fun onclick_hospedaje (view: View){
        val intent = Intent(this,hosteria_activity::class.java);
        startActivity(intent);
    }

    fun onclick_ubicacion (view: View){
        val gmmIntentUri = Uri.parse("google.streetview:cbll=-1.588313,-79.0068564")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        mapIntent.resolveActivity(packageManager)?.let {
            startActivity(mapIntent)
        }
        //val intent = Intent(this,MapsActivity::class.java);
        //startActivity(intent);
    }
}
