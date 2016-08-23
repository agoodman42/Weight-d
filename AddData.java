package com.gts.aarongoodman.weightd;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class AddData {
    public List<WeightRecord> WeightList = new ArrayList<>();
    List<Entry> entries = new ArrayList<>();
    LineDataSet dataSet = new LineDataSet(entries, "Weights and Dates"); // add entries to dataset
    LineData lineData = new LineData(dataSet);

    //Add the data created in on-click method to a chart


    public void addRecord(WeightRecord record) {
        WeightList.add(record);
    }


    public void recordsToEntries() {
        for (WeightRecord Record : WeightList) {
            // turn your data into Entry objects
            entries.add(new Entry(Record.getDate(), Record.getWeight()));
        }
    }

    public LineDataSet getLineDataSet() {
        return dataSet;
    }


    public LineData getLineData() {
        return lineData;
    }

    public LineData makeLineData() {
        recordsToEntries();
        return lineData;
    }
}


//Add the data created in the on-click method to a clickable list
