package com.example.practicodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrimeraActivity extends AppCompatActivity {

    private TextView tv1;
    private Button btn_sumar, btn_restar, btn_zoom_mas, btn_zoom_menos,btn_ocultar, btn_reset;
    private static int valor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera);
        findView();

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor = 0;
                String valor_string= String.valueOf(valor);
                tv1.setText(valor_string);
            }
        });

        btn_ocultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(" ");
            }
        });


        btn_zoom_mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float size_string = (Float)tv1.getTextSize();
                size_string++;
                tv1.setTextSize(size_string);
            }
        });

        btn_zoom_menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float size_string_menos = (Float)tv1.getTextSize();
                size_string_menos--;
                tv1.setTextSize(size_string_menos);
            }
        });

    }



    public void sumar(View view){
        valor++;
        String valor_string= String.valueOf(valor);
        tv1.setText(valor_string);
    }

    public void restar(View view){
        if(valor != 0) {
            valor--;
            String valor_string= String.valueOf(valor);
            tv1.setText(valor_string);
        }
    }


    protected void findView(){
        tv1=(TextView)findViewById(R.id.tv1);
        btn_sumar=(Button)findViewById(R.id.btn_sumar);
        btn_restar=(Button)findViewById(R.id.btn_restar);
        btn_zoom_mas=(Button)findViewById(R.id.btn_zoom_mas);
        btn_zoom_menos=(Button)findViewById(R.id.btn_zoom_menos);
        btn_ocultar=(Button)findViewById(R.id.btn_ocultar);
        btn_reset=(Button)findViewById(R.id.btn_reset);

    }

}