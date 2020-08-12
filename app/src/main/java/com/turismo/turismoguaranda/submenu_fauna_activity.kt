package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class submenu_fauna_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submenu_fauna_activity)
        val clase: Int = intent.getIntExtra("clase",1)
        val imageViewAnimalTexto: ImageView = findViewById(R.id.imageView4)
        val botonAnimal1: Button = findViewById(R.id.button37)
        val botonAnimal2: Button = findViewById(R.id.button38)
        val botonAnimal3: Button = findViewById(R.id.button39)
        val botonAnimal4: Button = findViewById(R.id.button40)
        if(clase==1){
            imageViewAnimalTexto.setImageResource(R.drawable.pantalla_voladores)
            botonAnimal1.setBackgroundResource(R.drawable.volador_nombre_curiquingue)
            botonAnimal2.setBackgroundResource(R.drawable.volador_nombre_gallo)
            botonAnimal3.setBackgroundResource(R.drawable.volador_nombre_gavilan)
            botonAnimal4.setBackgroundResource(R.drawable.volador_nombre_mirlo)
        }
        if(clase==2){
            imageViewAnimalTexto.setImageResource(R.drawable.pantalla_terrestres)
            botonAnimal1.setBackgroundResource(R.drawable.terrestres_nombre_chucuri)
            botonAnimal2.setBackgroundResource(R.drawable.terrestres_nombre_cusumbo)
            botonAnimal3.setBackgroundResource(R.drawable.terrestres_nombre_guanta)
            botonAnimal4.setBackgroundResource(R.drawable.terrestres_nombre_vicuna)
        }
        if(clase==3){
            imageViewAnimalTexto.setImageResource(R.drawable.pantalla_rastreros01)
            botonAnimal1.setBackgroundResource(R.drawable.rastreros_nombre_lagartija)
            botonAnimal2.setBackgroundResource(R.drawable.rastreros_nombre_raton)
            botonAnimal3.setBackgroundResource(R.drawable.rastreros_nombre_serpiente)
            botonAnimal4.setBackgroundResource(R.drawable.rastreros_nombre_zorrillo)
        }
    }

    fun onclick_animal_1 (view: View){
        val intento = Intent(this,informacion_fauna_activity::class.java);
        intento.putExtra("animal",1)
        intento.putExtra("clase",intent.getIntExtra("clase",1))
        startActivity(intento);
    }

    fun onclick_animal_2 (view: View){
        val intento = Intent(this,informacion_fauna_activity::class.java);
        intento.putExtra("animal",2)
        intento.putExtra("clase",intent.getIntExtra("clase",1))
        startActivity(intento);
    }

    fun onclick_animal_3 (view: View){
        val intento = Intent(this,informacion_fauna_activity::class.java);
        intento.putExtra("animal",3)
        intento.putExtra("clase",intent.getIntExtra("clase",1))
        startActivity(intento);
    }

    fun onclick_animal_4 (view: View){
        val intento = Intent(this,informacion_fauna_activity::class.java);
        intento.putExtra("animal",4)
        intento.putExtra("clase",intent.getIntExtra("clase",1))
        startActivity(intento);
    }
}