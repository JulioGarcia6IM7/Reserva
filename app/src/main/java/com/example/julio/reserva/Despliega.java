package com.example.julio.reserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Despliega extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despliega);

        Bundle llega = new Bundle();
        llega = this.getIntent().getExtras();

        String nombre = llega.getString("nom");
        String correo = llega.getString("correo");
        String telefono = llega.getString("tele");
        String noP = llega.getString("noP");

        TextView dat = findViewById(R.id.datos);

        dat.setText("Nombre:\n" + nombre + "\nCorreo:\n" + correo + "\nTelefono:\n" + telefono+ "\nNumero de personas:\n" + noP);
    }

    public void regresa(View vista){
        Intent reg = new Intent(this, MainActivity.class);
        finish();
        startActivity(reg);
    }

}
