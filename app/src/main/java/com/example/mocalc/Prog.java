package com.example.mocalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Prog extends AppCompatActivity {

    Toolbar bar;
    Spinner spin;
    String[] opsi ={"Decimal","Binary","Octal","Hexadecimal"};
    EditText ED;
    TextView des, biner, heksa, oktal;
    AppCompatButton butA, butB, butC, butD, butE, butF, but2, but3, but4, but5, but6, but7, but8, but9, butp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog);

        bar = findViewById(R.id.bar);
        setSupportActionBar(bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        butA = findViewById(R.id.btn_a);
        butB = findViewById(R.id.btn_b);
        butC = findViewById(R.id.btn_c);
        butD = findViewById(R.id.btn_d);
        butE = findViewById(R.id.btn_e);
        butF = findViewById(R.id.btn_f);
        but2 = findViewById(R.id.btn2);
        but3 = findViewById(R.id.btn3);
        but4 = findViewById(R.id.btn4);
        but5 = findViewById(R.id.btn5);
        but6 = findViewById(R.id.btn6);
        but7 = findViewById(R.id.btn7);
        but8 = findViewById(R.id.btn8);
        but9 = findViewById(R.id.btn9);
        butp = findViewById(R.id.btn_point);

        spin = findViewById(R.id.spinner);
        ED = findViewById(R.id.ED);

        des = findViewById(R.id.text11);
        biner = findViewById(R.id.text22);
        heksa = findViewById(R.id.text33);
        oktal = findViewById(R.id.text44);

        Drawable colorbg = ContextCompat.getDrawable(getApplicationContext(),R.drawable.hope2);
        Drawable colorbg2 = ContextCompat.getDrawable(getApplicationContext(),R.drawable.hope);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, opsi);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                switch(position){
                    case 0:
                        ED.setText(des.getText());

                        butA.setEnabled(false);
                        butA.setBackgroundDrawable(colorbg);
                        butB.setEnabled(false);
                        butB.setBackgroundDrawable(colorbg);
                        butC.setEnabled(false);
                        butC.setBackgroundDrawable(colorbg);
                        butD.setEnabled(false);
                        butD.setBackgroundDrawable(colorbg);
                        butE.setEnabled(false);
                        butE.setBackgroundDrawable(colorbg);
                        butF.setEnabled(false);
                        butF.setBackgroundDrawable(colorbg);
                        but2.setEnabled(true);
                        but2.setBackgroundDrawable(colorbg2);
                        but3.setEnabled(true);
                        but3.setBackgroundDrawable(colorbg2);
                        but4.setEnabled(true);
                        but4.setBackgroundDrawable(colorbg2);
                        but5.setEnabled(true);
                        but5.setBackgroundDrawable(colorbg2);
                        but6.setEnabled(true);
                        but6.setBackgroundDrawable(colorbg2);
                        but7.setEnabled(true);
                        but7.setBackgroundDrawable(colorbg2);
                        but8.setEnabled(true);
                        but8.setBackgroundDrawable(colorbg2);
                        but9.setEnabled(true);
                        but9.setBackgroundDrawable(colorbg2);
                        butp.setEnabled(false);
                        butp.setBackgroundDrawable(colorbg);
                        Toast.makeText(getBaseContext(),"Only Numbers Are Allowed", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        ED.setText(biner.getText());
                        butA.setEnabled(false);
                        butA.setBackgroundDrawable(colorbg);
                        butB.setEnabled(false);
                        butB.setBackgroundDrawable(colorbg);
                        butC.setEnabled(false);
                        butC.setBackgroundDrawable(colorbg);
                        butD.setEnabled(false);
                        butD.setBackgroundDrawable(colorbg);
                        butE.setEnabled(false);
                        butE.setBackgroundDrawable(colorbg);
                        butF.setEnabled(false);
                        butF.setBackgroundDrawable(colorbg);
                        but2.setEnabled(false);
                        but2.setBackgroundDrawable(colorbg);
                        but3.setEnabled(false);
                        but3.setBackgroundDrawable(colorbg);
                        but4.setEnabled(false);
                        but4.setBackgroundDrawable(colorbg);
                        but5.setEnabled(false);
                        but5.setBackgroundDrawable(colorbg);
                        but6.setEnabled(false);
                        but6.setBackgroundDrawable(colorbg);
                        but7.setEnabled(false);
                        but7.setBackgroundDrawable(colorbg);
                        but8.setEnabled(false);
                        but8.setBackgroundDrawable(colorbg);
                        but9.setEnabled(false);
                        but9.setBackgroundDrawable(colorbg);
                        butp.setEnabled(false);
                        butp.setBackgroundDrawable(colorbg);
                        Toast.makeText(getBaseContext(),"Only Numbers 0 And 1 Are Allowed", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        ED.setText(oktal.getText());
                        butA.setEnabled(false);
                        butA.setBackgroundDrawable(colorbg);
                        butB.setEnabled(false);
                        butB.setBackgroundDrawable(colorbg);
                        butC.setEnabled(false);
                        butC.setBackgroundDrawable(colorbg);
                        butD.setEnabled(false);
                        butD.setBackgroundDrawable(colorbg);
                        butE.setEnabled(false);
                        butE.setBackgroundDrawable(colorbg);
                        butF.setEnabled(false);
                        butF.setBackgroundDrawable(colorbg);
                        but2.setEnabled(true);
                        but2.setBackgroundDrawable(colorbg2);
                        but3.setEnabled(true);
                        but3.setBackgroundDrawable(colorbg2);
                        but4.setEnabled(true);
                        but4.setBackgroundDrawable(colorbg2);
                        but5.setEnabled(true);
                        but5.setBackgroundDrawable(colorbg2);
                        but6.setEnabled(true);
                        but6.setBackgroundDrawable(colorbg2);
                        but7.setEnabled(true);
                        but7.setBackgroundDrawable(colorbg2);
                        but8.setEnabled(false);
                        but8.setBackgroundDrawable(colorbg);
                        but9.setEnabled(false);
                        but9.setBackgroundDrawable(colorbg);
                        butp.setEnabled(false);
                        butp.setBackgroundDrawable(colorbg);

                        Toast.makeText(getBaseContext(),"Only Numbers 0-7 Are Allowed", Toast.LENGTH_LONG).show();
                        break;

                    case 3:
                        ED.setText(heksa.getText());
                        butA.setEnabled(true);
                        butA.setBackgroundDrawable(colorbg2);
                        butB.setEnabled(true);
                        butB.setBackgroundDrawable(colorbg2);
                        butC.setEnabled(true);
                        butC.setBackgroundDrawable(colorbg2);
                        butD.setEnabled(true);
                        butD.setBackgroundDrawable(colorbg2);
                        butE.setEnabled(true);
                        butE.setBackgroundDrawable(colorbg2);
                        butF.setEnabled(true);
                        butF.setBackgroundDrawable(colorbg2);
                        but2.setEnabled(true);
                        but2.setBackgroundDrawable(colorbg2);
                        but3.setEnabled(true);
                        but3.setBackgroundDrawable(colorbg2);
                        but4.setEnabled(true);
                        but4.setBackgroundDrawable(colorbg2);
                        but5.setEnabled(true);
                        but5.setBackgroundDrawable(colorbg2);
                        but6.setEnabled(true);
                        but6.setBackgroundDrawable(colorbg2);
                        but7.setEnabled(true);
                        but7.setBackgroundDrawable(colorbg2);
                        but8.setEnabled(true);
                        but8.setBackgroundDrawable(colorbg2);
                        but9.setEnabled(true);
                        but9.setBackgroundDrawable(colorbg2);
                        butp.setEnabled(false);
                        butp.setBackgroundDrawable(colorbg);
                        Toast.makeText(getBaseContext(),"All Allowed", Toast.LENGTH_LONG).show();
                        break;

                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }

        });

        Button but = findViewById(R.id.btn_equ);
        but.setOnClickListener(view -> {
            String pilih = spin.getSelectedItem().toString();
            String value = ED.getText().toString().trim();

            switch (pilih) {
                case "Decimal": {
                    long num = Long.parseLong(value);

                    des.setText(value);
                    biner.setText(Long.toBinaryString(num));
                    oktal.setText(Long.toOctalString(num));
                    heksa.setText(Long.toHexString(num));
                    break;
                }
                case "Binary": {
                    long num = Long.parseLong(value, 2);

                    des.setText(String.valueOf(num));
                    biner.setText(value);
                    oktal.setText(Long.toOctalString(num));
                    heksa.setText(Long.toHexString(num));
                    break;
                }
                case "Octal": {
                    long num = Long.parseLong(value, 8);

                    des.setText(String.valueOf(num));
                    biner.setText(Long.toBinaryString(num));
                    oktal.setText(value);
                    heksa.setText(Long.toHexString(num));
                    break;
                }
                case "Hexadecimal": {
                    long num = Long.parseLong(value, 16);

                    des.setText(String.valueOf(num));
                    biner.setText(Long.toBinaryString(num));
                    oktal.setText(Long.toOctalString(num));
                    heksa.setText(value);
                    break;
                }
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    private void updateText(String strToAdd){
        String oldStr = ED.getText().toString();
        int cursorPos = ED.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if (getString(R.string.display).equals(ED.getText().toString())){
            ED.setText(strToAdd);
        }
        else {
            ED.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        }
        ED.setSelection(cursorPos + 1);
    }

    public void BA(View view){
        updateText("A");
    }
    public void BB(View view){
        updateText("B");
    }
    public void BC(View view){
        updateText("C");
    }
    public void BD(View view){
        updateText("D");
    }
    public void BE(View view){
        updateText("E");
    }
    public void BF(View view){
        updateText("F");
    }
    public void zero(View view){
        updateText("0");
    }
    public void one(View view){
        updateText("1");
    }
    public void two(View view){
        updateText("2");
    }
    public void three(View view){
        updateText("3");
    }
    public void four(View view){
        updateText("4");
    }
    public void five(View view){
        updateText("5");
    }
    public void six(View view){
        updateText("6");
    }
    public void seven(View view){updateText("7");}
    public void eight(View view){updateText("8");}
    public void nine(View view){updateText("9");}
    public void point(View view){updateText("-");}
    public void hps(View view){
        int cursorPos = ED.getSelectionStart();
        int textLen = ED.getText().length();

        if (cursorPos != 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) ED.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            ED.setText(selection);
            ED.setSelection(cursorPos - 1);
        }
    }
    public void clear(View view){
        ED.setText("");
        des.setText("");
        biner.setText("");
        oktal.setText("");
        heksa.setText("");
    }
}