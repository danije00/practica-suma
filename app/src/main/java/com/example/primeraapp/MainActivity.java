package com.example.primeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText valor1;
    private EditText valor2;
    private TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1=(EditText) findViewById(R.id.valor1);
        valor2= (EditText) findViewById(R.id.valor2);
        res=(TextView) findViewById(R.id.res);
    }

    public void sumar (View view){
        String v1 = valor1.getText().toString();
        String v2 = valor2.getText().toString();
        int nro1= Integer.parseInt(v1);
        int nro2= Integer.parseInt(v2);
        int sum = nro1 + nro2;
        String result= String.valueOf(sum);
        res.setText(result);

        InputMethodManager teclado = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        teclado.hideSoftInputFromWindow(res.getWindowToken(),0);
    }

}
