package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class menu_fauna_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_fauna_activity)
    }

    fun onclick_aereos (view: View){
        val intent = Intent(this,submenu_fauna_activity::class.java);
        intent.putExtra("clase",1)
        startActivity(intent);
    }

    fun onclick_terrestres (view: View){
        val intent = Intent(this,submenu_fauna_activity::class.java);
        intent.putExtra("clase",2)
        startActivity(intent);
    }

    fun onclick_rastreros (view: View){
        val intent = Intent(this,submenu_fauna_activity::class.java);
        intent.putExtra("clase",3)
        startActivity(intent);
    }
}