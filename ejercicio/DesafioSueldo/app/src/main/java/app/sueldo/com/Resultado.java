package app.sueldo.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Resultado extends AppCompatActivity {
private TextView sueldob,aumento,sueldoneto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        sueldob=(TextView)findViewById(R.id.txvsalary);
        aumento=(TextView)findViewById(R.id.txvaum);
        sueldoneto=(TextView)findViewById(R.id.txvsalaryf);

        Bundle bundle=getIntent().getExtras();
        String sueldoba=bundle.getString("txtsueldobase");
        String aumentos=bundle.getString("aumento");
        String sueldoNet=bundle.getString("salariofin");
        String Noti=bundle.getString("notifi");
    Toast Notificacion=Toast.makeText(this,Noti,Toast.LENGTH_LONG);
    Notificacion.show();
        sueldob.setText("Sueldo Base: "+sueldoba);
        aumento.setText("Aumento: "+aumentos+"%");
        sueldoneto.setText("Sueldo Neto: "+sueldoNet);
    }
    public void finalizar(View V){
        finish();
    }
}