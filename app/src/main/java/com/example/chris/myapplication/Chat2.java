package com.example.chris.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Chat2 extends AppCompatActivity {

    TextView cchat1;
    Button boton;
    EditText mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat2);


        cchat1 = (TextView) findViewById(R.id.Contenido);
        boton = (Button)findViewById(R.id.BotonEnviar);
        mensaje = (EditText) findViewById(R.id.msjingresado);




        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cchat1.append(mensaje.getText().toString()+"\n");
                mensaje.setText("");


            }
        });
    }
}
