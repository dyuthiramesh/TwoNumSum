package com.example.twonumsum;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        buttonCalculate = findViewById(R.id.button);
        textViewResult = findViewById(R.id.textView);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSum();
            }
        });
    }

    private void calculateSum() {
        // Get the numbers entered by the user
        String number1String = editText1.getText().toString();
        String number2String = editText2.getText().toString();

        // Convert the strings to integers
        int number1 = Integer.parseInt(number1String);
        int number2 = Integer.parseInt(number2String);

        // Calculate the sum
        int sum = number1 + number2;

        // Display the result
        textViewResult.setText("Result: " + sum);
    }
}
