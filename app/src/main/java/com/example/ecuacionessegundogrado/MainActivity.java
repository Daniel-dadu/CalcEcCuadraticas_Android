package com.example.ecuacionessegundogrado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Calculator calc;

    EditText aConstantTxt;
    EditText bConstantTxt;
    EditText cConstantTxt;

    EditText rootOneTxt;
    EditText rootTwoTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc = new Calculator();

        aConstantTxt = (EditText) findViewById(R.id.aConstantTxt);
        bConstantTxt = (EditText) findViewById(R.id.bConstantTxt);
        cConstantTxt = (EditText) findViewById(R.id.cConstantTxt);

        rootOneTxt = (EditText) findViewById(R.id.rootOneTxt);
        rootTwoTxt = (EditText) findViewById(R.id.rootTwoTxt);
    }

    public void solveEq(View w){
        String result = calc.calculate(Integer.parseInt(aConstantTxt.getText().toString()),
                Integer.parseInt(bConstantTxt.getText().toString()),
                Integer.parseInt(cConstantTxt.getText().toString()));
        String[] parts = result.split("x");
        rootOneTxt.setText(parts[0]);
        rootTwoTxt.setText(parts[1]);
    }
}