package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class FahrenheitToCelsius extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_to_celsius);
        EditText edTemp;
        Button btnSubmit;
        TextView tvResults;
        DecimalFormat formatter;

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
                    Toast.makeText(FahrenheitToCelsius.this,"Please enter some value",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double f = Integer.parseInt(edTemp.getText().toString().trim());
                    double c = (5.0/9.0) * (f-32) ;
                ;
                    tvResults.setVisibility(View.VISIBLE);

                    String a = formatter.format(c) + "°C" ;
                    tvResults.setText(a);
                }
            }
        });
    }
}