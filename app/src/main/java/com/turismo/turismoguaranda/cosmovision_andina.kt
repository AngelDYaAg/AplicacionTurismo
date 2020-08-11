package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cosmovision_andina : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cosmovision_andina)
    }
    fun onclick_principios_andinos (view: View){
        val intent = Intent(this,principios_andinos::class.java);
        startActivity(intent);
    }
}