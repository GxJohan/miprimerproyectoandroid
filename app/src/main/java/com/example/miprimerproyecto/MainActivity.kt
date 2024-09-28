package com.example.miprimerproyecto

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.miprimerproyecto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //Inicializamos el binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Configuramos el listener para el botón usando binding
        binding.btnClick.setOnClickListener {
            //Cambiamos el texto del TextView usando binding
            binding.tvHola.text = "Botón clickeado"
        }

        var contador = 0
        //Configuramos el boton de contar
        binding.btnContar.setOnClickListener{
            contador+=1
            binding.tvContador.text=contador.toString()
        }

        //Configuramos el boton de reiniciar
        binding.btnReset.setOnClickListener{
            contador=0
            binding.tvContador.text=contador.toString()
        }





    }
}