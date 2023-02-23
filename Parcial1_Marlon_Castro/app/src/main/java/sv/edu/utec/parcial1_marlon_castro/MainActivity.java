package sv.edu.utec.parcial1_marlon_castro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    EditText edtContra;
    TextView tvValidacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtContra = findViewById(R.id.edtContra);
        edtName = findViewById(R.id.edtName);
        tvValidacion = findViewById(R.id.tvValidacion);

            Button boton = (Button) findViewById(R.id.btnLogin);
            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username = edtName.getText().toString();
                    String password = edtContra.getText().toString();

                    if(username.equals("parcialETps1") && password.equals("p4rC14l#tp$")){
                    setContentView(R.layout.activity_main2);
                    }else{
                        tvValidacion.setText("Los datos son incorrectos");
                    }
                }
            });

    }
}