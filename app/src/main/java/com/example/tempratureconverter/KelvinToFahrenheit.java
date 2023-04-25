package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class KelvinToFahrenheit extends AppCompatActivity {

    Button btnSubmit5;
    EditText edTemp5;
    TextView tvResults5;
    DecimalFormat formatter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_to_fahrenheit);

        btnSubmit5 = findViewById(R.id.btnSubmit5);
        tvResults5 = findViewById(R.id.tvResults5);
        edTemp5 = findViewById(R.id.edTemp5);
        tvResults5.setVisibility(View.GONE);
        formatter = new DecimalFormat("0.00");

        btnSubmit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edTemp5.getText().toString().isEmpty())
                {
                    Toast.makeText(KelvinToFahrenheit.this, "Enter some value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double k5 = Integer.parseInt(edTemp5.getText().toString().trim());
                    double f5 = (9.0/5.0)*(k5 - 273) + 32.0 ;

                    tvResults5.setVisibility(View.VISIBLE);

                    String k5f5 = formatter.format(f5) + " °F";
                    tvResults5.setText(k5f5);
                }
            }
        });
    }
}