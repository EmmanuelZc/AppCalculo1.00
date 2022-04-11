package com.example.appexamenes

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException
import java.io.OutputStreamWriter


class MainActivity : AppCompatActivity() {
    private val key="MY_KEY"
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPreferences=getSharedPreferences("Shared_Preferences", Context.MODE_PRIVATE)
        val btn1 = findViewById(R.id.btnname) as Button
        val txtname = findViewById(R.id.name) as EditText

        btn1.setOnClickListener {
            if (txtname.text.toString().isEmpty()) {
                Toast.makeText(this, "Por favor, ingrese su nombre", Toast.LENGTH_LONG).show();
            } else {
                try {
                    val archivo=OutputStreamWriter(openFileOutput("users.txt", Activity.MODE_PRIVATE))
                    archivo.write(txtname.text.toString())
                    archivo.flush()
                    archivo.close()
                }catch (e: IOException) {
                }
                val name=txtname.text.toString()
                Toast.makeText(this, "Bienvenido $name", Toast.LENGTH_LONG).show();
                val intent= Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()

            }
        }
    }
}



