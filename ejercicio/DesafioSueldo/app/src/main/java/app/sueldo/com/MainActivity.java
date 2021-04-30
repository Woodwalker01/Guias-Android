package app.sueldo.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText salary,years;
    private TextView txt_salary,txt_aument,txt_salary_fin;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salary = (EditText)findViewById(R.id.salary);
        years = (EditText)findViewById(R.id.years);

    }


    public void calcular(View view){
        float sala = 0;
        double salary_final,aument;
        int year = 0;
        String salarT = salary.getText().toString();
        String yearT = years.getText().toString();
        sala = Float.valueOf(salarT);
        year = Integer.valueOf(yearT);
    String Not;

        if(sala < 500 && year >=10){
            salary_final = sala * 1.20;
            aument = 0.20 *100;
            Not="su salario aumento un 20%";
        }else if(sala < 500 && year < 10 ){
            salary_final = sala * 1.05;
            aument = 0.05 * 100;
            Not="su salario aumento un 5%";
        }else{
            salary_final = sala;
            aument = 0;
            Not="su salario se mantiene igual";
        }
        String sl = String.valueOf(sala);
        String au = String.valueOf(aument);
        String slf = String.valueOf(df2.format(salary_final));
        Intent i= new Intent(this,Resultado.class);
        i.putExtra("txtsueldobase",sl);
        i.putExtra("aumento",au);
        i.putExtra("salariofin",slf);
        i.putExtra("notifi",Not);
        startActivity(i);
    }
}