package com.turismo.turismoguaranda

import android.content.Intent
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
        startActivity(intent);
    }

    fun onclick_naturaleza (view: View){
        val intent = Intent(this,naturaleza_activity::class.java);
        startActivity(intent);
    }
    fun onclick_comida (view: View){
        val intent = Intent(this,comida_activity::class.java);
        startActivity(intent);
    }
}
