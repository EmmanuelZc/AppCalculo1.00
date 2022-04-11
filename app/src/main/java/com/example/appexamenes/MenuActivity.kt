package com.example.appexamenes

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MenuActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var preferences:SharedPreferences
    private val key="MY_KEY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mi_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.info -> AlertDialog.Builder(this).setTitle("Acerca de la aplicación")
                .setMessage("Nombre de la aplicación: \nDesarrolladores:\n*Alarcón Sánchez Joshua\n*Álvarez Campos Saúl\n*Martínez Heredia Isaias\n*Morales Martínez José Antonio\n*Treviño Hernández Jonathan\n*Zurita Cariño Emmanuel Einar\n\nVersión de la App: v1.0.0")
                .show()
        }
        return super.onOptionsItemSelected(item)
    }
    fun botones(view: View){

        when(view.id){
            R.id.button3->Toast.makeText(this, "Elegiste: Sumas de Riemann", Toast.LENGTH_SHORT).show()
            R.id.intdef-> Toast.makeText(this, "Elegiste: Integral definida", Toast.LENGTH_SHORT).show()
            R.id.intnum-> Toast.makeText(this, "Elegiste: Integración numérica", Toast.LENGTH_SHORT).show()
            R.id.abtwc-> Toast.makeText(this, "Elegiste: Área entre curvas", Toast.LENGTH_SHORT).show()
            R.id.vsrev-> Toast.makeText(this, "Elegiste: Volumen de sólidos de revolución", Toast.LENGTH_SHORT).show()
            R.id.volst-> Toast.makeText(this, "Elegiste: Volumen por secciones transversales", Toast.LENGTH_SHORT).show()
            R.id.longarc-> Toast.makeText(this, "Elegiste: Longitud de arco", Toast.LENGTH_SHORT).show()
        }
        val intent1 = Intent(this, QuestionsAreaBC::class.java)
        val intent2 = Intent(this, QuestionsDefinida::class.java)
        val intent3 = Intent(this, QuestionsIntNumrica::class.java)
        val intent4 = Intent(this, Questionsareacur::class.java)
        val intent5 = Intent(this, QuestionsVolSolid::class.java)
        val intent6 = Intent(this, QuestionsVolSecT::class.java)
        val intent7 = Intent(this, QuestionsLongArc::class.java)
        when(view.id){
            R.id.button3->startActivity(intent1)
            R.id.intdef->startActivity(intent2)
            R.id.intnum->startActivity(intent3)
            R.id.abtwc->startActivity(intent4)
            R.id.vsrev->startActivity(intent5)
            R.id.volst->startActivity(intent6)
            R.id.longarc->startActivity(intent7)
        }
    }

    }