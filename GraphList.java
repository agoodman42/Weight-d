package com.gts.aarongoodman.weightd;


import android.util.Log;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class GraphList {

    public ArrayList<WeightRecord> weightList = new ArrayList<>();
    ArrayList<Entry> entries = new ArrayList<>();
    LineDataSet dataSet = new LineDataSet(entries, "Label"); // add entries to dataset
    LineData lineData = new LineData(dataSet);


    /*public void setValue() {
        WeightRecord baseWeight = new WeightRecord();
        baseWeight.setWeight(0);
        baseWeight.setDate(0);
        weightList.add(baseWeight);

    }*/

   /* public void addWeightRecord(Float buttonInput, int date){
        //WeightRecord newWeight = new WeightRecord();
        newWeight.setWeight(buttonInput);
        newWeight.setDate(date);
        weightList.add(newWeight);

    }*/

    public ArrayList<WeightRecord> getWeightList() {
        return weightList;
    }


    public WeightRecord getWeightList(int index) {
        return weightList.get(index);
    }

    public void makeMap() {
        for (WeightRecord weightRecord : weightList) {
            // turn your data into Entry objects
            entries.add(new Entry(weightRecord.getWeight(), weightRecord.getDate()));
        }


    }

    public LineData getLineData() {
        return lineData;
    }

    public void addData() {
        for (int i = 1; i < weightList.size(); i++) {
            Entry newEntry = new Entry(weightList.get(i).getWeight(), weightList.get(i).getDate());
            dataSet.addEntry(newEntry);
        }


    }
}


