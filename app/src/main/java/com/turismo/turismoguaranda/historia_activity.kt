package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class historia_activity : AppCompatActivity() {
    private var opcion = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historia_activity)
        val imageViewHistoria: ImageView = findViewById(R.id.imageView41)
        val buttonMenu: Button = findViewById(R.id.button15)
        imageViewHistoria.setImageResource(R.drawable.historia_1)
        buttonMenu.setBackgroundResource(R.drawable.boton_siguiente)
    }

    fun onclick_boton (view: View){
        if(opcion==1){
            val imageViewHistoria: ImageView = findViewById(R.id.imageView41)
            imageViewHistoria.setImageResource(R.drawable.historia_2)
            opcion = 2
        }else if(opcion==2){
            val imageViewHistoria: ImageView = findViewById(R.id.imageView41)
            val buttonMenu: Button = findViewById(R.id.button15)
            imageViewHistoria.setImageResource(R.drawable.historia_3)
            buttonMenu.setBackgroundResource(R.drawable.boton_menu)
            opcion = 3
        }else if(opcion==3){
            val intento = Intent(this,bienvenida_activity::class.java)
            startActivity(intento)
        }
    }
}