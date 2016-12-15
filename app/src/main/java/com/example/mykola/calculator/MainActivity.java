package com.example.mykola.calculator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static Intent getStartIntent(Context context) {
        Intent startIntent = new Intent(context, MainActivity.class);
        return startIntent;
    }
    private EditText mFirstNumber;
    private EditText mSecondNumber;
    private Button mSum;
    private Button mDifference;
    private Button mDivision;
    private Button mMulti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirstNumber=(EditText) findViewById(R.id.first_number);
        mSecondNumber=(EditText) findViewById(R.id.second_number);
        mMulti=(Button) findViewById(R.id.multi);
        mDivision=(Button) findViewById(R.id.division);
        mDifference=(Button) findViewById(R.id.difference);
        mSum=(Button) findViewById(R.id.sum);
        findViewById(R.id.calculate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            getFirstNumber();
            getSecondNumber();
            }
        });
        mSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSum();
            }
        });
        mMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMulti();
            }
        });
        mDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDivision();
            }
        });
        mDifference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDifference();
            }
        });
    }

    private int getFirstNumber()
    {
        return Integer.parseInt(mFirstNumber.getText().toString().trim());
    }

    private int getSecondNumber()
    {
        return Integer.parseInt(mSecondNumber.getText().toString().trim());
    }

    private void showSum(){
        showResult(getFirstNumber()+getSecondNumber());
    }

    private void showDifference(){
        showResult(getFirstNumber()-getSecondNumber());
    }

    private void showDivision(){
        showResult(getFirstNumber()/getSecondNumber());
    }

    private void showMulti(){
        showResult(getFirstNumber()*getSecondNumber());
    }

    private void showResult(Integer message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }


}
