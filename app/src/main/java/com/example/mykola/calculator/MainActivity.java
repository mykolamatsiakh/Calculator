package com.example.mykola.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mFirstNumberEditText;
    private EditText mSecondNumberEditText;
    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstNumberEditText = (EditText) findViewById(R.id.first_number);
        mSecondNumberEditText = (EditText) findViewById(R.id.second_number);
        mResultTextView = (TextView)findViewById(R.id.result);

        Button multiButton = (Button) findViewById(R.id.multi);
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMulti();
            }
        });

        Button divisionButton = (Button) findViewById(R.id.division);
        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDivision();
            }
        });

        Button differenceButton = (Button) findViewById(R.id.difference);
        differenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDifference();
            }
        });

        Button sumButton = (Button) findViewById(R.id.sum);
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSum();
            }
        });
    }

    private void showSum() {
        showResult(getFirstNumber() + getSecondNumber());
    }

    private void showDifference() {
        showResult(getFirstNumber() - getSecondNumber());
    }

    private void showDivision() {
        showResult(getFirstNumber() / getSecondNumber());
    }

    private void showMulti() {
        showResult(getFirstNumber() * getSecondNumber());
    }

    private void showResult(double result) {
       mResultTextView.setText(Double.toString(result));
    }

    private double getFirstNumber() {
        String number = mFirstNumberEditText.getText().toString().trim();
        if(TextUtils.isEmpty(number)){
            return 0;
        }
        return Double.parseDouble(number);
    }


    private double getSecondNumber() {
        String number = mSecondNumberEditText.getText().toString();
        if (TextUtils.isEmpty(number)) {
            return  0;
        }

        return Double.parseDouble(mSecondNumberEditText.getText().toString().trim());
    }
}
