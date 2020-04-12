package com.example.combustivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculo.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttonCalculo) {
            calcular();
        }
    }

    private fun calcular() {
        val gasolina = gasolina.text.toString().toFloat() //Acessa valor digitado e pega o valor do float.
        val etanol = etanol.text.toString().toFloat()

        val calc  =   etanol/gasolina

        if(calc<0.7){
            valor.text ="O combustivel mais vantajoso seria o  Etanol  "
        }else{
            valor.text ="O combustivel mais vantajoso  seria a Gasolina"
        }
    }

}
