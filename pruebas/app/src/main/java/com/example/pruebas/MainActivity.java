package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tot;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.Cant);
        et2=(EditText)findViewById(R.id.price);
        tot=(EditText)findViewById(R.id.tot);
    }
    public  void calcular(View view){
        string valor1=et1.getText().toString();
        string valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        int total=nro1*nro2;
        String resu=String.valueOf(total);
        tot.setText(resu);
    }
}