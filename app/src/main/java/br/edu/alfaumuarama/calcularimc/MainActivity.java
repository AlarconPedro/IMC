package br.edu.alfaumuarama.calcularimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtPeso   = findViewById(R.id.edtPeso);
    EditText edtAltura = findViewById(R.id.edtAltura);
    TextView txtResult = findViewById(R.id.txtResultado);

    Button btnCalcular = findViewById(R.id.btnCalcular);

    float peso, altura, imc;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculaIMC();
            }
        });
    }

    public void CalculaIMC() {
        peso   = Float.parseFloat(edtPeso.getText().toString());
        altura = Float.parseFloat(edtAltura.getText().toString());
        imc = (peso / (altura * altura));
        result = Float.toString(imc);
        txtResult.setText(result);
    }
}