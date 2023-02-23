package sv.edu.utec.parcial1_marlon_castro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText edtPeso;
    EditText edtEstatura;
    TextView tvMensaje;

    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtPeso = findViewById(R.id.edtPeso);
        edtEstatura = findViewById(R.id.edtEstatura);
        tvMensaje = findViewById(R.id.tvMensaje);
        btnCalcular = findViewById(R.id.btnCalcular);
    }

    public void OperarCalcular(View view){
        double P = 0;
        double E = 0;
        double IMC = 0;

        E = Double.parseDouble(edtEstatura.getText().toString());
        P = Double.parseDouble(edtPeso.getText().toString());


        IMC = (P)/(E*E);

        if(IMC < 10.5){
            tvMensaje.setText("Críticamente Bajo de Peso");
        }

        else if(IMC < 15.9){
            tvMensaje.setText("Severamente Bajo de Peso");
        }

        else if(IMC < 18.5){
            tvMensaje.setText("Bajo de Peso");
        }

        else if(IMC < 25){
            tvMensaje.setText("Normal (peso saludable)");
        }

        else if(IMC <  30){
            tvMensaje.setText("Sobrepeso");
        }

        else if(IMC < 35){
            tvMensaje.setText("Obesidad Clase 1 - Moderadamente Obeso");
        }

        else if(IMC < 40){
            tvMensaje.setText("Obesidad Clase 2 - Severamente Obeso");
        }

        else if(IMC > 50){
            tvMensaje.setText("Obesidad Clase 3 - Críticamente Obeso");
        }else{
            tvMensaje.setText("Dato Incorrecto");
        }
    }
}



