package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class hosteria_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hosteria_activity)
    }

    fun onclick_hosteria_el_angel (view: View){
        val intent = Intent(this,hotel_inicio_activity::class.java)
        intent.putExtra("option",1)
        startActivity(intent)
    }

    fun onclick_hosteria_la_colina (view: View){
        val intent = Intent(this,hotel_inicio_activity::class.java)
        intent.putExtra("option",2)
        startActivity(intent)
    }

    fun onclick_hosteria_rustica (view: View){
        val intent = Intent(this,hotel_inicio_activity::class.java)
        intent.putExtra("option",3)
        startActivity(intent)
    }

    fun onclick_hosteria_cabana (view: View){
        val intent = Intent(this,hotel_inicio_activity::class.java)
        intent.putExtra("option",4)
        startActivity(intent)
    }
}
