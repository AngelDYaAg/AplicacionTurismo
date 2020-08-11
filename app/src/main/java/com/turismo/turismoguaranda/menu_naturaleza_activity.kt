package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class menu_naturaleza_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_naturaleza_activity)
    }

    fun onclick_fauna (view: View){
        val intent = Intent(this,menu_fauna_activity::class.java)
        startActivity(intent)
    }

    fun onclick_flora (view: View){
        val intent = Intent(this,naturaleza_activity::class.java)
        startActivity(intent)
    }

    fun onclick_minerales (view: View){
        val intent = Intent(this,submenu_minerales::class.java)
        startActivity(intent)
    }
}