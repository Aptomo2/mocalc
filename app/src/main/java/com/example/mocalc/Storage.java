package com.example.mocalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Storage extends AppCompatActivity {

    Toolbar bar;
    Spinner spinner1;
    String[] list ={"Byte","KiloByte(KB)","MegaByte(MB)","GigaByte(GB)","TeraByte(TB)"};
    EditText inputnum;
    TextView txtbyte,txtmb,txtkb,txtgb,txttb;
    Button btnprocess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        bar = findViewById(R.id.bar);
        setSupportActionBar(bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtbyte = (TextView) findViewById(R.id.txtbyte);
        txtkb = (TextView) findViewById(R.id.txtkb);
        txtmb = (TextView) findViewById(R.id.txtmb);
        txtgb = (TextView) findViewById(R.id.txtgb);
        txttb = (TextView) findViewById(R.id.txttb);
        spinner1 = (Spinner) findViewById(R.id.spinner1);

        inputnum = (EditText) findViewById(R.id.inputnum);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {


                switch (position) {
                    case 0:
                        inputnum.setText(txtbyte.getText());
                        break;
                    case 1:
                        inputnum.setText(txtkb.getText());
                        break;
                    case 2:
                        inputnum.setText(txtmb.getText());
                        break;
                    case 3:
                        inputnum.setText(txtgb.getText());
                        break;
                    case 4:
                        inputnum.setText(txttb.getText());
                        break;
                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

    btnprocess = (Button) findViewById(R.id.btnprocess);

    btnprocess.setOnClickListener(view -> {

        String pilihlist = spinner1.getSelectedItem().toString();
        String valuenum = inputnum.getText().toString().trim();

        switch (pilihlist){
            case  "Byte" : {
                double number = Double.parseDouble(valuenum);
                txtbyte.setText(valuenum);
                double kb = number / 1024;
                double mb = kb / 1024;
                double gb = mb / 1024;
                double tb = gb / 1020;

                txtkb.setText(Double.toString(kb));
                txtmb.setText(Double.toString(mb));
                txtgb.setText(Double.toString(gb));
                txttb.setText(Double.toString(tb));

               break; }
            case  "KiloByte(KB)" : {
                double number = Double.parseDouble(valuenum);
                txtkb.setText(valuenum);
                double b = number * 1024;
                double mb = number / 1024;
                double gb = mb / 1024;
                double tb = gb / 1020;

                txtbyte.setText(Double.toString(b));
                txtmb.setText(Double.toString(mb));
                txtgb.setText(Double.toString(gb));
                txttb.setText(Double.toString(tb));
                break; }
            case "MegaByte(MB)" : {
                double number = Double.parseDouble(valuenum);
                txtmb.setText(valuenum);
                double kb = number * 1024;
                double b = kb * 1024;
                double gb = number / 1024;
                double tb = gb / 1020;

                txtbyte.setText(Double.toString(b));
                txtkb.setText(Double.toString(kb));
                txtgb.setText(Double.toString(gb));
                txttb.setText(Double.toString(tb));
                break; }
            case "GigaByte(GB)" : {
                double number = Double.parseDouble(valuenum);
                txtgb.setText(valuenum);

                double mb = number * 1024;
                double kb = mb * 1024;
                double b = kb * 1024;
                double tb = number / 1020;

                txtbyte.setText(Double.toString(b));
                txtkb.setText(Double.toString(kb));
                txtmb.setText(Double.toString(mb));
                txttb.setText(Double.toString(tb));

                break; }
            case "TeraByte(TB)" : {
                double number = Double.parseDouble(valuenum);
                txttb.setText(valuenum);

                double b =  number * 1024 * 1024 * 1024 * 1024 ;
                double kb = number * 1024 * 1024 * 1024;
                double mb = number * 1024 * 1024;
                double gb = number * 1024;

                txtbyte.setText(Double.toString(b));
                txtkb.setText(Double.toString(kb));
                txtmb.setText(Double.toString(mb));
                txtgb.setText(Double.toString(gb));

                break; }
            default:
                Toast.makeText(this, "Gagal Proses", Toast.LENGTH_SHORT).show();
                break;

        }
    });
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}