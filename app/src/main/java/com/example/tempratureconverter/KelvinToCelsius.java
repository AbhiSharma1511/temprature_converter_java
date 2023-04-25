package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class KelvinToCelsius extends AppCompatActivity {

    Button btnSubmit1;
    EditText edTemp1;
    TextView tvResults1;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_to_celsius);


        btnSubmit1 = findViewById(R.id.btnSubmit1);
        tvResults1 = findViewById(R.id.tvResults1);
        edTemp1 = findViewById(R.id.edTemp1);
        formatter = new DecimalFormat("0.00");
        tvResults1.setVisibility(View.GONE);

        btnSubmit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edTemp1.getText().toString().isEmpty())
                {
                    Toast.makeText(KelvinToCelsius.this,"Enter some value",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double k1 = Integer.parseInt(edTemp1.getText().toString().trim());
                    double c1 = k1 - 273.15;

                    tvResults1.setVisibility(View.VISIBLE);

                    String k1c1 = formatter.format(c1) + " °C" ;
                    tvResults1.setText(k1c1);
                }
            }
        });

    }
}