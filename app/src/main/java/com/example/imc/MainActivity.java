package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private EditText peso;
    private EditText altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
        peso = findViewById(R.id.peso);
        altura = findViewById(R.id.altura);
    }

    public void handleCalculate(View view){
        String text = "";
        Double pesoInteger = Double.parseDouble(peso.getText().toString());
        Double alturaInteger = Double.parseDouble(altura.getText().toString());
        Double result = pesoInteger / (alturaInteger * alturaInteger);

        if(result < 19){
            text = "Abaixo do peso";
        }else if (result >= 19 && result < 25 ){
            text = "Peso normal";
        }else if(result >= 25 && result < 30){
            text = "Sobrepeso";
        }else if(result >= 30 && result < 40){
            text = "Obesidade tipo 1";
        }else if (result >= 40){
            text = "Obesidade tipo 2";
        }

        resultado.setText(text);
    }
}