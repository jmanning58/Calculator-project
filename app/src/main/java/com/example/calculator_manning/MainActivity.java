package com.example.calculator_manning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button zeroB, oneB, twoB, threeB, fourB, fiveB, sixB, sevenB,
            eightB, nineB, decimalB, clearB, totalB, addB, minusB, divideB, multiplyB;
    private TextView display;
    float valueOne, valueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.zeroB = findViewById(R.id.zero_button);
        this.oneB = findViewById(R.id.one_button);
        this.twoB = findViewById(R.id.two_button);
        this.threeB = findViewById(R.id.three_button);
        this.fourB = findViewById(R.id.four_button);
        this.fiveB = findViewById(R.id.five_button);
        this.sixB = findViewById(R.id.six_button);
        this.sevenB = findViewById(R.id.seven_button);
        this.eightB = findViewById(R.id.eight_button);
        this.nineB = findViewById(R.id.nine_button);

        this.decimalB = findViewById(R.id.decimal_point);
        this.clearB = findViewById(R.id.clear_button);

        this.totalB = findViewById(R.id.equals_button);
        this.addB = findViewById(R.id.add_button);
        this.minusB = findViewById(R.id.minus_button);
        this.divideB = findViewById(R.id.division_button);
        this.multiplyB = findViewById(R.id.multiply_button);

        this.display = findViewById(R.id.edit_field);

        // All button displays
        oneB.setOnClickListener(v -> display.setText(display.getText() + "1"));
        twoB.setOnClickListener(v -> display.setText(display.getText() + "2"));
        threeB.setOnClickListener(v -> display.setText(display.getText() + "3"));
        fourB.setOnClickListener(v -> display.setText(display.getText() + "4"));
        fiveB.setOnClickListener(v -> display.setText(display.getText() + "5"));
        sixB.setOnClickListener(v -> display.setText(display.getText() + "6"));
        sevenB.setOnClickListener(v -> display.setText(display.getText() + "7"));
        eightB.setOnClickListener(v -> display.setText(display.getText() + "8"));
        nineB.setOnClickListener(v -> display.setText(display.getText() + "9"));
        zeroB.setOnClickListener(v -> display.setText(display.getText() + "0"));

        decimalB.setOnClickListener(v -> display.setText(display.getText() + "."));
        clearB.setOnClickListener(v -> display.setText(display.getText() + "")); // Doesn't work yet

        // Just button displays, nothing else yet
        addB.setOnClickListener(v -> display.setText(display.getText() + " + "));
        minusB.setOnClickListener(v -> display.setText(display.getText() + " - "));
        divideB.setOnClickListener(v -> display.setText(display.getText() + " / "));
        multiplyB.setOnClickListener(v -> display.setText(display.getText() + " * "));
    }
}