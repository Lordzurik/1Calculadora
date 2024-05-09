package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText TxtN1;
    ;
    private EditText TxtN2;
    private EditText TxtN3;
    private EditText TxtN4;
    private EditText TxtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtSoma = findViewById(R.id.TxtSoma);
        TxtSub = findViewById(R.id.TxtSub);
        TxtDiv = findViewById(R.id.TxtDiv);
        TxtMult = findViewById(R.id.TxtMult);

    }
}