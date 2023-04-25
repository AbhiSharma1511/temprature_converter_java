package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class temp_activity2 extends AppCompatActivity {
    TextView tvCF,tvCTF,tvFTC,tvCK,tvCTK,tvKTC,tvFK,tvKTF,tvFTK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp2);

        tvCF = findViewById(R.id.tvCF);
        tvCTF = findViewById(R.id.tvCTF);
        tvFTC = findViewById(R.id.tvFTC);
        tvCK = findViewById(R.id.tvCK);
        tvCTK = findViewById(R.id.tvCTK);
        tvKTC = findViewById(R.id.tvKTC);
        tvFK = findViewById(R.id.tvFK);
        tvKTF = findViewById(R.id.tcKTF);
        tvFTK = findViewById(R.id.tvFTK);

        tvFTC.setVisibility(View.GONE);
        tvCTF.setVisibility(View.GONE);
        tvCTK.setVisibility(View.GONE);
        tvKTC.setVisibility(View.GONE);
        tvKTF.setVisibility(View.GONE);
        tvFTK.setVisibility(View.GONE);


        // ************ THIS IS FOR CELSIUS TO FAHRENHEIT ***************
        tvCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvFTC.setVisibility(View.VISIBLE);
                tvCTF.setVisibility(View.VISIBLE);

            }
        });
        tvCTF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(temp_activity2.this,com.example.tempratureconverter.celsiusToFahrenheit.class);
                startActivity(intent);

            }
        });
        tvFTC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(temp_activity2.this, FahrenheitToCelsius.class);
                startActivity(intent);

            }
        });


        // ************ THIS IS FOR CELSIUS TO KELVIN ***************
        tvCK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvKTC.setVisibility(View.VISIBLE);
                tvCTK.setVisibility(View.VISIBLE);

            }
        });
        tvCTK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(temp_activity2.this,com.example.tempratureconverter.CelsiusToKelvin.class);
                startActivity(intent);

            }
        });
        tvKTC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(temp_activity2.this,com.example.tempratureconverter.KelvinToCelsius.class);
                startActivity(intent);

            }
        });



        // ************ THIS IS FOR KELVIN TO FAHRENHEIT ***************
        tvFK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvKTF.setVisibility(View.VISIBLE);
                tvFTK.setVisibility(View.VISIBLE);

            }
        });
        tvKTF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(temp_activity2.this,com.example.tempratureconverter.KelvinToFahrenheit.class);
                startActivity(intent);

            }
        });
        tvFTK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(temp_activity2.this,com.example.tempratureconverter.FahrenheitToKelvin.class);
                startActivity(intent);

            }
        });

    }
}