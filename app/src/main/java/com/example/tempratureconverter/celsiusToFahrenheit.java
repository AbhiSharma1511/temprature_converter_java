package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class celsiusToFahrenheit extends AppCompatActivity {
    EditText edTemp;
    Button btnSubmit;
    TextView tvResults;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_to_fahrenheit);

        edTemp = findViewById(R.id.edTemp1);
        btnSubmit = findViewById(R.id.btnSubmit1);
        tvResults = findViewById(R.id.tvResults1);
        formatter = new DecimalFormat("0.00");
        tvResults.setVisibility(View.GONE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edTemp.getText().toString().isEmpty())
                {
                    Toast.makeText(celsiusToFahrenheit.this,"Please enter some value",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double c = Integer.parseInt(edTemp.getText().toString().trim());
                    double f = (9.0/5.0)*c + 32.0;
                    tvResults.setVisibility(View.VISIBLE);

                    String a = formatter.format(f) + "°F" ;
                    tvResults.setText(a);
                }
            }
        });
    }
}