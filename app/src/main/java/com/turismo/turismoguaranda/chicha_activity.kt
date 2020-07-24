package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class chicha_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chicha_activity)
    }
    fun onclick_chicha_ingre(view: View){
        val intent = Intent(this,ingredientes_activity::class.java);
        intent.putExtra("optionElemento",7)
        startActivity(intent);
    }
    fun onclick_chicha_valor(view: View){
        val intent = Intent(this,valor_nutricional_activity::class.java);
        intent.putExtra("optionElemento",8)
        startActivity(intent);

    }
}