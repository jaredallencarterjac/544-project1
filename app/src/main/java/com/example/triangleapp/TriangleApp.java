package com.example.triangleapp;

import android.util.Log;

import java.util.ArrayList;

public class TriangleApp {
    public String input;
    public String output;
    public ArrayList<Float> triangleSides ;

    public  ArrayList<Float> parseInput(String input)  {
        this.output = "output";
        Log.i("PARSE",this.output);
        return null;
    }

    public void setInput(String input){
        this.input = input;
    }
    public String getOutput(){
        String output = this.output;

        return output;
    }
}
