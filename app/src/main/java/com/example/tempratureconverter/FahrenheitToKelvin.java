package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class FahrenheitToKelvin extends AppCompatActivity {

    Button btnSubmit4;
    TextView tvResults4;
    EditText edTemp4;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_to_kelvin);

        btnSubmit4 = findViewById(R.id.btnSubmit4);
        tvResults4 = findViewById(R.id.tvResults4);
        edTemp4 = findViewById(R.id.edTemp4);
        formatter = new DecimalFormat("0.00");
        tvResults4.setVisibility(View.GONE);

        btnSubmit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edTemp4.getText().toString().isEmpty())
                {
                    Toast.makeText(FahrenheitToKelvin.this, "Enter some value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double f = Integer.parseInt(edTemp4.getText().toString().trim());
                    double k = (f  + 459.67)* (5.0/9.0) ;

                    tvResults4.setVisibility(View.VISIBLE);

                    String fk = formatter.format(k) + " K";
                    tvResults4.setText(fk);
                }
            }
        });
    }
}