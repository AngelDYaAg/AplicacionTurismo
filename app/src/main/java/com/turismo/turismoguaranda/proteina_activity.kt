package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class proteina_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proteina_submenu_activity)
    }
    fun onclick_proteina_fritada(view: View){
        val intent = Intent(this,fritada_de_llama::class.java);
        startActivity(intent);
    }
    fun onclick_proteina_sancocho(view: View){
        val intent = Intent(this,sanco_activity::class.java);
        startActivity(intent);
    }
}