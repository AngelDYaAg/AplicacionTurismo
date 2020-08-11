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

    fun onclick_lugares_turisticos (view: View){
        val intent = Intent(this,menu_lugares_turisticos::class.java);
        startActivity(intent);
    }

    fun onclick_ubicacion (view: View){
        val gmmIntentUri = Uri.parse("https://www.google.com.ec/maps/place/Guaranda/@-1.5908848,-79.0178488,14z/data=!3m1!4b1!4m5!3m4!1s0x91d31633414f2155:0x7ff4699820ed74ad!8m2!3d-1.5911691!4d-78.9990379")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        startActivity(mapIntent)
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
