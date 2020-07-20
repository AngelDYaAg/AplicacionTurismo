package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class naturaleza_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naturaleza_activity)
    }

    fun onclick_oreja_de_conejo (view: View){
        val intent = Intent(this,flora_activity::class.java)
        intent.putExtra("option",1)
        startActivity(intent)
    }
    fun onclick_salvia (view: View){
        val intent = Intent(this,flora_activity::class.java)
        intent.putExtra("option",2)
        startActivity(intent)
    }
    fun onclick_lupino (view: View){
        val intent = Intent(this,flora_activity::class.java)
        intent.putExtra("option",3)
        startActivity(intent)
    }
    fun onclick_mimosa (view: View){
        val intent = Intent(this,flora_activity::class.java)
        intent.putExtra("option",4)
        startActivity(intent)
    }
    fun onclick_chilca (view: View){
        val intent = Intent(this,flora_activity::class.java)
        intent.putExtra("option",5)
        startActivity(intent)
    }
    fun onclick_retama (view: View){
        val intent = Intent(this,flora_activity::class.java)
        intent.putExtra("option",6)
        startActivity(intent)
    }
    fun onclick_aire (view: View){
        val intent = Intent(this,elementos_activity::class.java)
        intent.putExtra("optionElemento",1)
        startActivity(intent)
    }
    fun onclick_agua (view: View){
        val intent = Intent(this,elementos_activity::class.java)
        intent.putExtra("optionElemento",2)
        startActivity(intent)
    }
    fun onclick_fuego (view: View){
        val intent = Intent(this,elementos_activity::class.java)
        intent.putExtra("optionElemento",3)
        startActivity(intent)
    }
    fun onclick_tierra (view: View){
        val intent = Intent(this,elementos_activity::class.java)
        intent.putExtra("optionElemento",4)
        startActivity(intent)
    }
}
