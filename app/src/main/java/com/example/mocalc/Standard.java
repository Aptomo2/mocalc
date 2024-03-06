package com.example.mocalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import org.mariuszgromada.math.mxparser.*;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Standard extends AppCompatActivity {


    private EditText layar;
    private TextView layar2, layar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);

        layar = findViewById(R.id.screen);
        layar2 = findViewById(R.id.screen2);
        layar3 = findViewById(R.id.screen3);

        Toolbar bar = (Toolbar) findViewById(R.id.bar);
        setSupportActionBar(bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private void updateText(String strToAdd){
        String oldStr = layar.getText().toString();
        int cursorPos = layar.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if (getString(R.string.display).equals(layar.getText().toString())){
            layar.setText(strToAdd);
        }
        else {
            layar.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        }
        layar.setSelection(cursorPos + 1);
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
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
    public void seven(View view){
        updateText("7");
    }
    public void eight(View view){
        updateText("8");
    }
    public void nine(View view){
        updateText("9");
    }
    public void multi(View view){
        updateText("×");
    }
    public void div(View view){
        updateText("÷");
    }
    public void add(View view){
        updateText("+");
    }
    public void sub(View view){
        updateText("-");
    }
    public void clear(View view){
        layar.setText("");
        layar2.setText("");
        layar3.setText("");
    }
    public void par(View view){
        int cursorPos = layar.getSelectionStart();
        int openPar = 0;
        int closedPar= 0;
        int textLen = layar.getText().length();

        for (int i = 0; i < cursorPos; i++){
            if (layar.getText().toString().charAt(i) == '('){
                openPar += 1;
            }
            if (layar.getText().toString().charAt(i) == ')'){
                closedPar += 1;
            }
        }
        if (openPar == closedPar || layar.getText().toString().charAt(textLen - 1) == '('){
            updateText("(");
        }
        else if (closedPar < openPar && layar.getText().toString().charAt(textLen - 1) != '(') {
            updateText(")");
        }
        layar.setSelection(cursorPos + 1);
    }
    public void expo(View view){
        updateText("^");
    }
    public void persen(View view){
        updateText("%");
    }
    public void plus(View view){
        updateText("-");
    }
    public void dec(View view){
        updateText(".");
    }
    public void equ(View view){
        String userExp = layar.getText().toString();
        userExp = userExp.replaceAll("÷", "/");
        userExp = userExp.replaceAll("×", "*");

        Expression exp = new Expression(userExp);

        String result = String.valueOf(exp.calculate());

        layar2.setText(result);
        layar3.setText("=");
    }
    public void hps(View view){
        int cursorPos = layar.getSelectionStart();
        int textLen = layar.getText().length();

        if (cursorPos != 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) layar.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            layar.setText(selection);
            layar.setSelection(cursorPos - 1);
        }
    }
}