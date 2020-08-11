package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class proteina_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proteina_submenu_activity)
        val clase: Int = intent.getIntExtra("clase",1)
        val imageViewSubmenu: ImageView = findViewById(R.id.imageView29)
        if (clase==1){
            imageViewSubmenu.setImageResource(R.drawable.opciones_proteina)
        }
        if (clase==2){
            imageViewSubmenu.setImageResource(R.drawable.submenu_maiz)
        }
        if (clase==3){
            imageViewSubmenu.setImageResource(R.drawable.submenu_papa)
        }

    }
    fun onclick_opcion1(view: View){
        val intento = Intent(this,fritada_de_llama::class.java);
        intento.putExtra("comida",1)
        intento.putExtra("clase",intent.getIntExtra("clase",1))
        startActivity(intento);
    }
    fun onclick_opcion2(view: View){

        val intento = Intent(this,fritada_de_llama::class.java);
        intento.putExtra("comida",2)
        intento.putExtra("clase",intent.getIntExtra("clase",1))
        startActivity(intento);
    }
}