package com.example.parcialsegundocorte;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
public class FacturaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);

        // Obtener datos pasados desde MainActivity
        Intent intent = getIntent();
        double totalConIVA = intent.getDoubleExtra("totalConIVA", 0.0);
        int cantidad1 = intent.getIntExtra("cantidad1", 0);
        int cantidad2 = intent.getIntExtra("cantidad2", 0);
        int cantidad3 = intent.getIntExtra("cantidad3", 0);

        // Mostrar los datos en la interfaz de usuario
        TextView totalTextView = findViewById(R.id.totalTextView);
        totalTextView.setText("Total con IVA: $" + totalConIVA);

        TextView cantidad1TextView = findViewById(R.id.cantidad1TextView);
        cantidad1TextView.setText("Cantidad de ARRACACHA: " + cantidad1);

        TextView cantidad2TextView = findViewById(R.id.cantidad2TextView);
        cantidad2TextView.setText("Cantidad de TOMATE: " + cantidad2);

        TextView cantidad3TextView = findViewById(R.id.cantidad3TextView);
        cantidad3TextView.setText("Cantidad de CEBOLLA: " + cantidad3);
    }
}
