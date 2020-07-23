package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class chiguiles_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chiguiles_activity)
    }
    fun onclick_chigui_ingre(view: View){
        val intent = Intent(this,ingredientes_activity::class.java);
        intent.putExtra("optionElemento",5)
        startActivity(intent);
    }
    fun onclick_chingui_valor(view: View){
        val intent = Intent(this,valor_nutricional_activity::class.java);
        intent.putExtra("optionElemento",6)
        startActivity(intent);

    }
}