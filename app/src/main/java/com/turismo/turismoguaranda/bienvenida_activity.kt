package com.turismo.turismoguaranda

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat

class bienvenida_activity : AppCompatActivity() {

    private var ACCESS_FINE_PERMISSION = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida_activity)
        if (ActivityCompat.checkSelfPermission(this,android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),ACCESS_FINE_PERMISSION)
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

    fun onclick_scannerQR (view: View){
        val intent = Intent(this,scanner_activity::class.java);
        startActivity(intent);
    }
    fun onclick_cosmo (view: View){
        val intent = Intent(this,cosmovision_andina::class.java);
        startActivity(intent);
    }
}
