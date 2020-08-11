package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class menu_lugares_turisticos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_lugares_turisticos)
    }

    fun onclick_siete_colinas(view: View){
        val intent = Intent(this,lugares_turisticos::class.java);
        intent.putExtra("option",1)
        startActivity(intent);
    }

    fun onclick_indio_guaranga(view: View){
        val intent = Intent(this,lugares_turisticos::class.java);
        intent.putExtra("option",2)
        startActivity(intent);
    }

    fun onclick_parque_central(view: View){
        val intent = Intent(this,lugares_turisticos::class.java);
        intent.putExtra("option",3)
        startActivity(intent);
    }

    fun onclick_la_guitarra(view: View){
        val intent = Intent(this,lugares_turisticos::class.java);
        intent.putExtra("option",4)
        startActivity(intent);
    }

    fun onclick_las_cochas(view: View){
        val intent = Intent(this,lugares_turisticos::class.java);
        intent.putExtra("option",5)
        startActivity(intent);
    }

    fun onclick_gad_guaranda(view: View){
        val intent = Intent(this,lugares_turisticos::class.java);
        intent.putExtra("option",6)
        startActivity(intent);
    }

    fun onclick_santuario(view: View){
        val intent = Intent(this,lugares_turisticos::class.java);
        intent.putExtra("option",7)
        startActivity(intent);
    }

    fun onclick_plaza_carnaval(view: View){
        val intent = Intent(this,lugares_turisticos::class.java);
        intent.putExtra("option",8)
        startActivity(intent);
    }

}