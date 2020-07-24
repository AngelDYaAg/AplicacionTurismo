package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class fritada_de_llama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proteina_fritada_activity)
    }

    fun onclick_proteina_ingredientes (view: View){
        val intent = Intent(this,ingredientes_activity::class.java);
        intent.putExtra("optionIngrediente",1)
        startActivity(intent);

    }
    fun onclick_proteina_valor_nutricional (view: View){
        val intent = Intent(this,valor_nutricional_activity::class.java);
        intent.putExtra("optionValorNutriciona",2)

        startActivity(intent);

    }



}