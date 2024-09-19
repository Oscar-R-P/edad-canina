package com.example.edadcanina;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.txtEditEdad);
        TextView textView = findViewById(R.id.resultadoViewId);
        Button button = findViewById(R.id.btnCalcular);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edad = editText.getText().toString();
                if (edad.isEmpty()){
                    return;
                }
                int edadInt = Integer.parseInt(edad);
                int res = edadInt * 7;
                String resStr = "La edad de tu perro es: "+ res+" años";
                textView.setText(resStr);
            }
        });
    }
}