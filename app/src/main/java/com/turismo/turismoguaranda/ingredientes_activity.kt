package com.turismo.turismoguaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class ingredientes_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredientes)
        val clase: Int = intent.getIntExtra("clase",1)
        val comida: Int = intent.getIntExtra("comida",1)
        val imageViewIngredientes: ImageView = findViewById(R.id.imageViewIngredientes)
        if (clase==1&&comida==1){
            imageViewIngredientes.setImageResource(R.drawable.ingr__fritada_de_llama)
        }
        if (clase==1&&comida==2){
            imageViewIngredientes.setImageResource(R.drawable.ingr__sancocho)
        }
        if (clase==2&&comida==1){
            imageViewIngredientes.setImageResource(R.drawable.ingr__chiguiles)
        }
        if (clase==2&&comida==2){
            imageViewIngredientes.setImageResource(R.drawable.ingr__chicha)
        }
        if (clase==3&&comida==1){
            imageViewIngredientes.setImageResource(R.drawable.ingr__oca)
        }
        if (clase==3&&comida==2){
            imageViewIngredientes.setImageResource(R.drawable.ingr__papa)
        }

    }
}