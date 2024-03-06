package com.example.mocalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Suhu extends AppCompatActivity {

    Toolbar bar;
    Spinner spin;
    String[] opsi ={"Kelvin","Celsius","Fahrenheit","Reaumur","Rankine"};
    EditText ED;
    TextView kel, cel, fah, rer, ran;
    Double K, C, F, Re, Ra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);

        bar = findViewById(R.id.bar);
        setSupportActionBar(bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spin = findViewById(R.id.spinner1);
        ED = findViewById(R.id.EDscreen);


        kel = findViewById(R.id.Kel);
        cel = findViewById(R.id.Cel);
        fah = findViewById(R.id.Fah);
        rer = findViewById(R.id.Rer);
        ran = findViewById(R.id.Ran);


        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, opsi);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 0:
                        ED.addTextChangedListener(textKelvin);
                        break;
                    case 1:
                        ED.addTextChangedListener(textCelsius);
                        break;
                    case 2:
                        ED.addTextChangedListener(textFahren);
                        break;
                    case 3:
                        ED.addTextChangedListener(textRea);
                        break;
                    case 4:
                        ED.addTextChangedListener(textRan);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    TextWatcher textKelvin = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @SuppressLint("SetTextI18n")
        @Override
        public void afterTextChanged(Editable editable) {
            String suhu = ED.getText().toString().trim();
            try {
                double temp = Double.parseDouble(suhu);

                C = temp - 273.15;
                F = temp * 1.8 - 459.67;
                Re = (temp - 273.15) * 0.8;
                Ra = temp * 1.8;

            }catch(NumberFormatException ignored){}

            kel.setText(suhu+"  K");
            cel.setText(C +" °C");
            fah.setText(F +" °F");
            rer.setText(Re +" °Ré");
            ran.setText(Ra +" °R");
        }
    };

    TextWatcher textCelsius = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @SuppressLint("SetTextI18n")
        @Override
        public void afterTextChanged(Editable editable) {
            if(editable.toString().trim().length()==0){
                return;
            }
            String suhu = ED.getText().toString().trim();
            try {
                double temp = Double.parseDouble(suhu);

                K = temp + 273.15;
                F = temp * 1.8 + 32;
                Re = temp * 0.8;
                Ra = temp * 1.8 + 32 + 459.67;

            }catch (NumberFormatException ignored){}

            kel.setText(K +"  K");
            cel.setText(suhu+" °C");
            fah.setText(F +" °F");
            rer.setText(Re +" °Ré");
            ran.setText(Ra +" °R");
        }
    };

    TextWatcher textFahren = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @SuppressLint("SetTextI18n")
        @Override
        public void afterTextChanged(Editable editable) {
            if(editable.toString().trim().length()==0){
                return;
            }
            String suhu = ED.getText().toString().trim();
            try {
                double temp = Double.parseDouble(suhu);

                K = (temp + 459.67) / 1.8;
                C = (temp - 32) / 1.8;
                Re = (temp - 32) / 2.25;
                Ra = temp + 459.67;

            }catch (NumberFormatException ignored){}

            kel.setText(K +"  K");
            cel.setText(C +" °C");
            fah.setText(suhu +" °F");
            rer.setText(Re +" °Ré");
            ran.setText(Ra +" °R");
        }
    };

    TextWatcher textRea = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @SuppressLint("SetTextI18n")
        @Override
        public void afterTextChanged(Editable editable) {
            if(editable.toString().trim().length()==0){
                return;
            }
            String suhu = ED.getText().toString().trim();
            try {
                double temp = Double.parseDouble(suhu);

                K = temp * 1.25 + 273.15;
                C = temp * 1.25;
                F = temp * 2.25 + 32;
                Ra = temp * 2.25 + 32 + 459.67;

            }catch (NumberFormatException ignored){}

            kel.setText(K +"  K");
            cel.setText(C +" °C");
            fah.setText(F +" °F");
            rer.setText(suhu+" °Ré");
            ran.setText(Ra +" °R");
        }
    };

    TextWatcher textRan = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @SuppressLint("SetTextI18n")
        @Override
        public void afterTextChanged(Editable editable) {
            if(editable.toString().trim().length()==0){
                return;
            }
            String suhu = ED.getText().toString().trim();
            try {
                double temp = Double.parseDouble(suhu);

                K = temp / 1.8;
                C = (temp - 32 - 459.67) / 1.8;
                F = temp - 459.67;
                Re = (temp - 32 - 459.67) / 2.25;

            }catch (NumberFormatException ignored){}

            kel.setText(K +"  K");
            cel.setText(C +" °C");
            fah.setText(F +" °F");
            rer.setText(Re +" °Ré");
            ran.setText(suhu+" °R");
        }
    };

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}