package com.example.laboratorio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<postulante> lista = new ArrayList<postulante>();

        EditText etp = findViewById(R.id.paterno);
        EditText etm = findViewById(R.id.materno);
        EditText etn = findViewById(R.id.nombre);
        EditText etf = findViewById(R.id.fecha);
        EditText etc = findViewById(R.id.colegio);
        EditText etca = findViewById(R.id.carrera);

        Button br = findViewById(R.id.registrar);
        Button bm = findViewById(R.id.mostrar);

        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String paterno = etp.getText().toString();
                String materno = etm.getText().toString();
                String nombre = etn.getText().toString();
                String fecha = etf.getText().toString();
                String colegio = etc.getText().toString();
                String carrera = etca.getText().toString();

                if (paterno.length() == 0 || materno.length() == 0 | nombre.length() == 0 ||
                        fecha.length() == 0 || colegio.length() == 0 || carrera.length() == 0) {
                    Toast.makeText(MainActivity.this, "Se debe completar todos los espacios", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Postulante agregado", Toast.LENGTH_LONG).show();
                    postulante e = new postulante(paterno, materno, nombre, fecha, colegio, carrera);
                    lista.add(e);
                    etp.setText("");
                    etm.setText("");
                    etn.setText("");
                    etf.setText("");
                    etc.setText("");
                    etca.setText("");
                }


            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, lista + "");
            }
        });
    }
}