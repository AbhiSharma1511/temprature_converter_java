package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class CelsiusToKelvin extends AppCompatActivity {

    Button btnSubmit3;
    EditText edTemp3;
    TextView tvResults3;
    DecimalFormat formatter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_to_kelvin);
        
        btnSubmit3 = findViewById(R.id.btnSubmit3);
        edTemp3 = findViewById(R.id.edTemp3);
        tvResults3 = findViewById(R.id.tvResults3);
        tvResults3.setVisibility(View.GONE);

        formatter = new DecimalFormat("0.00");
        
        btnSubmit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edTemp3.getText().toString().isEmpty())
                {
                    Toast.makeText(CelsiusToKelvin.this, "Enter some value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double a = Integer.parseInt(edTemp3.getText().toString().trim());
                    double b = a + 273.15;
                    tvResults3.setVisibility(View.VISIBLE);


                    String str = formatter.format(b) + " K";
                    tvResults3.setText(str);
                }
            }
        });
    }
}