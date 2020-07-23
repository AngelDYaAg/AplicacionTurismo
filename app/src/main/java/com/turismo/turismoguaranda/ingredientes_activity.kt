package com.turismo.turismoguaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class ingredientes_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredientes)

    val opcionElementoingredientes: Int = intent.getIntExtra("optionElemento",1)
    val imageViewIngredientes: ImageView = findViewById(R.id.imageViewIngredientes)
    if(opcionElementoingredientes==1){
        imageViewIngredientes.setImageResource(R.drawable.ingr__fritada_de_llama)
    }
        if(opcionElementoingredientes==3){
            imageViewIngredientes.setImageResource(R.drawable.ingr__sancocho)
        }
        if(opcionElementoingredientes==5){
            imageViewIngredientes.setImageResource(R.drawable.ingr__chiguiles)
        }
        if(opcionElementoingredientes==7){
            imageViewIngredientes.setImageResource(R.drawable.ingr__chicha)
        }
        if(opcionElementoingredientes==9){
            imageViewIngredientes.setImageResource(R.drawable.ingr__oca)
        }
        if(opcionElementoingredientes==11){
            imageViewIngredientes.setImageResource(R.drawable.ingr__papa)
        }
    }
}