package com.gts.aarongoodman.weightd;

import java.util.ArrayList;

public class GraphList {


    ArrayList<Float> AL = new ArrayList<>();
    String ArrayString;

    public void addValue(float buttonInput) {
        AL.add(buttonInput);
    }
    public String printArray(){
        ArrayString = AL.toString();
        return ArrayString;
    }

    public float getAL(int index) {
        return AL.get(index);

    }



}
