package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class sanco_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sanco_activity)
    }
    fun onclick_proteina_s(view: View){
        val intent = Intent(this,ingredientes_activity::class.java);
        intent.putExtra("optionElemento",3)
        startActivity(intent);
    }
    fun onclick_proteina_valor_sanco (view: View){
        val intent = Intent(this,valor_nutricional_activity::class.java);
        intent.putExtra("optionElemento",4)
        startActivity(intent);

    }
}