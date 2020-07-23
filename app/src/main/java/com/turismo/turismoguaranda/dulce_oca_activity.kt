package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class dulce_oca_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dulce_oca_activity)
    }
    fun onclick_dulceoca_ingre(view: View){
        val intent = Intent(this,ingredientes_activity::class.java);
        intent.putExtra("optionElemento",9)
        startActivity(intent);
    }
    fun onclick_dulceoca_valor(view: View){
        val intent = Intent(this,valor_nutricional_activity::class.java);
        intent.putExtra("optionElemento",10)
        startActivity(intent);

    }
}