package com.example.practicodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtPesos;
    private RadioButton rbDolar;
    private RadioButton rbEuro;
    private RadioButton rbReal;
    private TextView tvResultado;
    private Button btnConvertir;
    private Button btnReinicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findView();

        btnConvertir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int pesos, resultado;
                pesos = Integer.parseInt(txtPesos.getText().toString());
                if(rbDolar.isChecked()==true){
                    resultado = pesos * 150;
                    String resultado_string = String.valueOf(resultado);
                    tvResultado.setText(resultado_string);
                }else if (rbEuro.isChecked()==true){
                    resultado = pesos * 114;
                    String resultado_string = String.valueOf(resultado);
                    tvResultado.setText(resultado_string);
                }else if (rbReal.isChecked()==true){
                    resultado = pesos * 18;
                    String resultado_string = String.valueOf(resultado);
                    tvResultado.setText(resultado_string);
                }else{
                    Toast.makeText(MainActivity.this, "Seleccione una moneda", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnReinicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResultado.setText("0");
                txtPesos.setText("");
                rbReal.setChecked(false);
                rbEuro.setChecked(false);
                rbDolar.setChecked(false);
            }
        });

    }


    protected void findView(){
        txtPesos = (EditText) findViewById(R.id.txtPesos);
        rbDolar = (RadioButton) findViewById(R.id.rbDolar);
        rbEuro = (RadioButton) findViewById(R.id.rbEuro);
        rbReal = (RadioButton) findViewById(R.id.rbReal);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
        btnConvertir = (Button) findViewById(R.id.btnConvertir);
        btnReinicio = (Button) findViewById(R.id.btnReinicio);
    }

}