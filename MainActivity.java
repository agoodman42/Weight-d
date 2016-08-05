package com.gts.aarongoodman.weightd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;


import com.github.mikephil.charting.charts.LineChart;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {


    private Button mSubmitButton;
    private EditText mWeightText;
    private RelativeLayout mRelativeLayout;
    private Integer mWeightInt;
    private Float parseTextEdit;
    private GraphList GL = new GraphList();
    private LineChart mLineChart;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.layout);
        mSubmitButton = (Button) findViewById(R.id.submitButton);
        // get EditText by id
        mWeightText = (EditText) findViewById(R.id.editWeightText);
        // Store EditText in Variable
        //create chart object


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    parseTextEdit = Float.parseFloat(mWeightText.getText().toString());
                } catch (Exception e) {
                    makeText(MainActivity.this, "Invalid Input", LENGTH_SHORT).show();
                }

                if (parseTextEdit != null && parseTextEdit != 0) {
                    GL.addValue(parseTextEdit);
                    makeText(MainActivity.this, mWeightText.getText().toString(), LENGTH_SHORT).show();
                }
            }
        };
        mSubmitButton.setOnClickListener(listener);




    }
}

