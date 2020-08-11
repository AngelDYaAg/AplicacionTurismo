package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class principios_andinos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principios_andinos)
    }
    fun onclick_detalleprin (view: View){
        val intent = Intent(this,detalleprin::class.java);

        startActivity(intent);
    }
}