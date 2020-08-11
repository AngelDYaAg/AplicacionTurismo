package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class detalleprin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalleprin)
    }

    fun onclick_correspondencia (view: View){
        val intent = Intent(this,menu_naturaleza_activity::class.java);
        startActivity(intent);
    }
    fun onclick_complementariedad (view: View){
        val intent = Intent(this,submenu_minerales::class.java);
        startActivity(intent);
    }
    fun onclick_reciprocidad (view: View){
        val intent = Intent(this,comida_activity::class.java);
        startActivity(intent);
    }
}