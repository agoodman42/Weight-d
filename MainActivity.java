package com.gts.aarongoodman.weightd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;


import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public AddData ad;
    public List<WeightRecord> WeightList = new ArrayList<>();
    public List<Entry> entries;
    public LineDataSet dataSet;
    public LineData lineData;
    public int i;
    public XAxis xAxis;
    public YAxis leftAxis;
    private Button mSubmitButton;
    private EditText mWeightText;
    private RelativeLayout mRelativeLayout;
    private LineChart mLineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.layout);
        mSubmitButton = (Button) findViewById(R.id.submitButton);
        mWeightText = (EditText) findViewById(R.id.editWeightText);
        mLineChart = (LineChart) findViewById(R.id.lineChart);


        leftAxis = mLineChart.getAxisLeft();


        mLineChart.setDescription("Test");
        mLineChart.setNoDataTextDescription("This chart has no data");
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisMinValue(0);
        xAxis.setAxisMaxValue(365);
        leftAxis.setAxisMinValue(0);
        leftAxis.setAxisMaxValue(500);


        WeightRecord testRecord = new WeightRecord("Joe", 250, 105);
        final WeightRecord testRecord1 = new WeightRecord("Jason", 150, 205);
        WeightList.add(testRecord);
        WeightList.add(testRecord1);


        entries = new ArrayList<>();
        dataSet = new LineDataSet(entries, "Weights and Dates"); // add entries to dataset
        lineData = new LineData(dataSet);
        mLineChart.setData(lineData);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                WeightRecord newRecord = new WeightRecord("Test User", i, Float.valueOf(mWeightText.getText().toString()));
                //create a new record now
                WeightList.add(newRecord);
                entries.add(new Entry(newRecord.getDate(), newRecord.getWeight()));
                mLineChart.setData(lineData);
                mLineChart.invalidate(); // refresh
                i += 1;


            }
        };
        mSubmitButton.setOnClickListener(listener);




    }
}

