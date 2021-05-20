package com.example.practicodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrimeraActivity extends AppCompatActivity {

    private TextView tv1;
    private Button btn_sumar, btn_restar, btn_zoom_mas, btn_zoom_menos,btn_ocultar, btn_reset;
    private static int valor = 0;
    boolean estadobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera);
        findView();
        estadobtn=true;

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                valor = 0;
                String valor_string= String.valueOf(valor);
                tv1.setText(valor_string);
            }
        });

        btn_ocultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ocultar();
                cambiarestado(v);
            }
        });



        btn_zoom_mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float size_float = (Float)tv1.getTextSize();
                size_float++;
                tv1.setTextSize(size_float);
            }
        });


    }

    public void zoommenos(View view){
        Float menor = (Float)tv1.getTextSize();
        menor--;
        tv1.setTextSize(menor);
    }


    private void ocultar(){
        if(tv1.getVisibility()==View.VISIBLE){
            tv1.setVisibility(View.INVISIBLE);
        }else{
            tv1.setVisibility(View.VISIBLE);
        }

    }


    public void sumar(View view){
        valor++;
        String valor_string = String.valueOf(valor);
        tv1.setText(valor_string);
    }


    public void restar(View view){
        if(valor != 0) {
            valor--;
            String valor_string= String.valueOf(valor);
            tv1.setText(valor_string);
        }
    }

    //metodo cambia texto boton ocultar cuando se presiona
    public void cambiarestado(View v){
        if(estadobtn==true){
            btn_ocultar.setText("MOSTRAR");
            estadobtn=false;
        }else{
            btn_ocultar.setText("OCULTAR");
            estadobtn=true;
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