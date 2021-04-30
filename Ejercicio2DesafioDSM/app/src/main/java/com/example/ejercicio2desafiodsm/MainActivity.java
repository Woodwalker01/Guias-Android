package com.example.ejercicio2desafiodsm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText Votos;
private TextView C1,C2,C3,C4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Votos=(EditText)findViewById(R.id.txtVotos);
        C1=(TextView)findViewById(R.id.txtc1);
        C2=(TextView)findViewById(R.id.txtc2);
        C3=(TextView)findViewById(R.id.txtc3);
        C4=(TextView)findViewById(R.id.txtc4);

    }

    public void Contador(View v){
        try{
       String[] Vot= Votos.getText().toString().split(",");
       C1.setText(""+Votos.length());
       C2.setText(""+Vot[2]);
       C3.setText(""+Votos.getText().toString());
        Integer N,v1=0,v2=0,v3=0,v4=0;
        int p1,p2,p3,p4;
        N=Vot.length;
        int[] Val=new int[Vot.length];
 for(int j=0;j<Vot.length;j++){
     Val[j] = Integer.parseInt(Vot[j]);
 }
        for(int i=0;i<N;i++) {

            if (Val[i] == 1) {
                v1 += 1;
            }
            if (Val[i] == 2) {
                v2 += 1;
            }
            if (Val[i] == 3) {
                v3 += 1;
            }
            if (Val[i] == 4) {
                v4 += 1;
            }
            p1 = v1 * 100 / N;
            p2 = v2 * 100 / N;
            p3 = v3 * 100 / N;
            p4 = v4 * 100 / N;
            C1.setText("Candidato #1: Votos: " + v1 + " Porcentaje: " + p1 + "%");
            C2.setText("Candidato #1: Votos: " + v2 + " Porcentaje: " + p2 + "%");
            C3.setText("Candidato #1: Votos: " + v3 + " Porcentaje: " + p3 + "%");
            C4.setText("Candidato #1: Votos: " + v4 + " Porcentaje: " + p4 + "%");

        }


        }catch(Exception e){
            Toast.makeText(this,"Debe separar los candidatos como se muestra en el ejemplo",Toast.LENGTH_LONG).show();
        }
}}