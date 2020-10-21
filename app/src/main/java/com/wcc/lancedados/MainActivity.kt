package com.wcc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLancarDados = findViewById<Button>(R.id.lanceDadosBotao)
        val valorDados1 = findViewById<TextView>(R.id.numero1)
        val valorDados2 = findViewById<TextView>(R.id.numero2)


        botaoLancarDados.setOnClickListener {
            valorDados1.text = lancarDados().toString()
            valorDados2.text = lancarDados().toString()
        }
    }

    fun lancarDados(): Int{
        return (1..6).random()
    }
}
