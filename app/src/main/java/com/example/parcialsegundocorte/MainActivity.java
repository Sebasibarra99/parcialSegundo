package com.example.parcialsegundocorte;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button Calcular;
    private EditText Cantidad1;
    private EditText Cantidad2;
    private EditText Cantidad3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calcular = findViewById(R.id.Calcular);
        Cantidad1 = findViewById(R.id.Cantidad1);
        Cantidad2 = findViewById(R.id.Cantidad2);
        Cantidad3 = findViewById(R.id.Cantidad3);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener las cantidades ingresadas
                int cantidad1 = Integer.parseInt(Cantidad1.getText().toString());
                int cantidad2 = Integer.parseInt(Cantidad2.getText().toString());
                int cantidad3 = Integer.parseInt(Cantidad3.getText().toString());

                // Calcular el total con IVA
                double totalConIVA = IVA(cantidad1, cantidad2, cantidad3);

                // Crear un Intent para abrir la siguiente actividad
                Intent intent = new Intent(MainActivity.this, FacturaActivity.class);
                // Pasar los datos a la siguiente actividad
                intent.putExtra("totalConIVA", totalConIVA);
                intent.putExtra("cantidad1", cantidad1);
                intent.putExtra("cantidad2", cantidad2);
                intent.putExtra("cantidad3", cantidad3);
                // Iniciar la siguiente actividad
                startActivity(intent);
            }
        });
    }

    public double IVA(int a, int b, int c) {
        double iva = (a + b + c) * 0.16;
        return iva;
    }
}
