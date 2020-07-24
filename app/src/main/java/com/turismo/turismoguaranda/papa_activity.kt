package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class papa_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_papa_activity)
    }
    fun onclick_papa_dulce(view: View){
        val intent = Intent(this,dulce_oca_activity::class.java);
        startActivity(intent);
    }
    fun onclick_papa_china(view: View){
        val intent = Intent(this,papa_china_activity::class.java);
        startActivity(intent);
    }
}