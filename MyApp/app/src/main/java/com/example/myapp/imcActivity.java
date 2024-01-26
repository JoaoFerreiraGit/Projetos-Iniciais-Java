package com.example.myapp;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import java.text.DecimalFormat;

public class imcActivity extends AppCompatActivity {

    private EditText edtPeso, edtAltura;
    private Button btnCalcular;
    private TextView txtvResultTitulo, txtvResultCalculo, txtvResultLaudo, txtvResult;
    private ImageView imgResult;
    private DecimalFormat  pattern = new DecimalFormat( "##.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        edtPeso = findViewById(R.id.edtPeso);
        edtAltura = findViewById(R.id.edtAltura);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtvResultTitulo = findViewById(R.id.txtvResultTitulo);
        txtvResultCalculo = findViewById(R.id.txtvResultCalculo);
        txtvResultLaudo = findViewById(R.id.txtvResultLaudo);
        txtvResult = findViewById(R.id.txtvResult);
        imgResult = findViewById(R.id.imgResult);

    }

    public void calculaImc(View v){
        double peso = Float.parseFloat(edtPeso.getText().toString());
        double altura = Float.parseFloat( edtAltura.getText().toString());

        double resultadoImc = peso/(Math.pow(altura,2));

        txtvResult.setText(pattern.format(resultadoImc) +" kg/m²");

        txtvResultTitulo.setVisibility(View.VISIBLE);
        txtvResultCalculo.setVisibility(View.VISIBLE);
        txtvResultLaudo.setVisibility(View.VISIBLE);
        imgResult.setVisibility(View.VISIBLE);

        if(resultadoImc < 18.5){
            txtvResultTitulo.setText(R.string.result0Titulo);
            txtvResultCalculo.setText(R.string.result0Calculo);
            txtvResultLaudo.setText(R.string.result0Laudo);
            imgResult.setBackgroundResource(R.drawable.baixopeso);
        } else if(resultadoImc >= 18.5 && resultadoImc < 25){
            txtvResultTitulo.setText(R.string.result1Titulo);
            txtvResultCalculo.setText(R.string.result1Calculo);
            txtvResultLaudo.setText(R.string.result1Laudo);
            imgResult.setBackgroundResource(R.drawable.pesonormal);
        } else if(resultadoImc >=25 && resultadoImc < 30){
            txtvResultTitulo.setText(R.string.result2Titulo);
            txtvResultCalculo.setText(R.string.result2Calculo);
            txtvResultLaudo.setText(R.string.result2Laudo);
            imgResult.setBackgroundResource(R.drawable.acimadopeso);
        }  else if(resultadoImc >= 30 && resultadoImc < 35){
            txtvResultTitulo.setText(R.string.result3Titulo);
            txtvResultCalculo.setText(R.string.result3Calculo);
            txtvResultLaudo.setText(R.string.result3Laudo);
            imgResult.setBackgroundResource(R.drawable.obeso1);
        }  else if(resultadoImc > 35 && resultadoImc <= 40){
            txtvResultTitulo.setText(R.string.result4Titulo);
            txtvResultCalculo.setText(R.string.result4Calculo);
            txtvResultLaudo.setText(R.string.result4Laudo);
            imgResult.setBackgroundResource(R.drawable.obeso2);
        } else {
            txtvResultTitulo.setText(R.string.result5Titulo);
            txtvResultCalculo.setText(R.string.result5Calculo);
            txtvResultLaudo.setText(R.string.result5Laudo);
            imgResult.setBackgroundResource(R.drawable.obeso3);
        }
    }

}