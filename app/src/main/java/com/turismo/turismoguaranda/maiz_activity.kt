package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class maiz_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maiz_activity)
    }
    fun onclick_maiz_chin(view: View){
        val intent = Intent(this,chiguiles_activity::class.java);
        startActivity(intent);
    }
    fun onclick_maiz_chicha(view: View){
        val intent = Intent(this,chicha_activity::class.java);
        startActivity(intent);
    }
}