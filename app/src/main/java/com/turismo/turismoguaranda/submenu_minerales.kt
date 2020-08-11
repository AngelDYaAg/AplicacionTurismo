package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class submenu_minerales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submenu_minerales)
    }
    fun onclick_cuarzo_cristal(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",1)
        startActivity(intent);
    }
    fun onclick_amatista(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",2)
        startActivity(intent);

    }
    fun onclick_citrino(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",3)
        startActivity(intent);

    }
    fun onclick_malaquita(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",4)
        startActivity(intent);

    }
    fun onclick_cuarzo_ahumado(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",5)
        startActivity(intent);

    }
    fun onclick_curazo_rosado(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",6)
        startActivity(intent);

    }
    fun onclick_rodcrosita(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",7)
        startActivity(intent);

    }
    fun onclick_turmalina_negra(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",8)
        startActivity(intent);

    }
    fun onclick_lapislazuli(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",9)
        startActivity(intent);

    }
    fun onclick_amazonita(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",10)
        startActivity(intent);

    }
    fun onclick_ajaspe_rojo(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",11)
        startActivity(intent);

    }
    fun onclick_labradorita(view: View){
        val intent = Intent(this,descripcion_minerales::class.java);
        intent.putExtra("option",12)
        startActivity(intent);

    }

}