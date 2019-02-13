package com.example.julio.reserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reserva(View vista){
        EditText nombre = findViewById(R.id.nombre);
        EditText correo = findViewById(R.id.correo);
        EditText telefono = findViewById(R.id.telefono);
        EditText noPersonas = findViewById(R.id.noPersonas);

        String nombreE;
        String correoE;
        String telefonoE;
        String noPersonasE;

        if(!nombre.getText().toString().equals("") && !correo.getText().toString().equals("")
        && !telefono.getText().toString().equals("") && !noPersonas.getText().toString().equals("")){
            nombreE = nombre.getText().toString();
            correoE = correo.getText().toString();
            telefonoE = telefono.getText().toString();
            noPersonasE = noPersonas.getText().toString();

            Intent manda = new Intent(this, Despliega.class);
            Bundle datos = new Bundle();
            datos.putString("nom", nombreE);
            datos.putString("correo", correoE);
            datos.putString("tele", telefonoE);
            datos.putString("noP",noPersonasE);
            manda.putExtras(datos);
            finish();
            startActivity(manda);
        }
        else{

        }
    }
}
