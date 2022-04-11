package com.example.appexamenes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class ActivityResult6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result6)
        val username= intent.getStringExtra(Constantes.USER_NAME)
        val tvname=findViewById<TextView>(R.id.username)
        val tvscore=findViewById<TextView>(R.id.score)
        val btnfinish=findViewById<Button>(R.id.btnfinish)
        if (fileList().contains("users.txt")) {
            try {
                val archivo = InputStreamReader(openFileInput("users.txt"))
                val br = BufferedReader(archivo)
                var linea = br.readLine()
                val todo = StringBuilder()
                while (linea != null) {
                    todo.append(linea + "\n")
                    linea = br.readLine()
                }
                br.close()
                archivo.close()
                tvname.setText(todo)

            }catch (e: IOException) {

            }
        }
        val totalQuestions=intent.getIntExtra(Constantes.TOTAL_QUESTIONS,0)
        val correctAnswers=intent.getIntExtra(Constantes.CORRECT_ANSWERS,0)
        tvscore.text="Puntaje obtenido:$correctAnswers de $totalQuestions"
        btnfinish.setOnClickListener{
            startActivity(Intent(this,MenuActivity::class.java))
        }

    }
}
