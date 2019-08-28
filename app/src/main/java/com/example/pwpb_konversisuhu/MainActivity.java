package com.example.pwpb_konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    double celcius, kelvin, fahrenheit, reamur;
    EditText txtCelcius, txtKelvin, txtFahrenheit, txtReamur;
    Button btnKonversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCelcius = findViewById(R.id.txtCelcius);
        txtKelvin = findViewById(R.id.txtKelvin);
        txtFahrenheit = findViewById(R.id.txtFahrenheit);
        txtReamur = findViewById(R.id.txtReamur);
        btnKonversi = findViewById(R.id.btnKonversi);

        btnKonversi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnKonversi:
                celcius = Double.parseDouble(txtCelcius.getText().toString().trim());
                kelvin = celcius+273;
                fahrenheit = (celcius*9/5)+32;
                reamur = celcius*4/5;

                txtKelvin.setText(""+kelvin);
                txtFahrenheit.setText(""+fahrenheit);
                txtReamur.setText(""+reamur);
        }
    }
}
