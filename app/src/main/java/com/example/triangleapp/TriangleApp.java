package com.example.triangleapp;

import android.util.Log;

import java.util.Arrays;

public class TriangleApp {
    private String input;
    private String output;
    private String errMessage;
    private boolean isExit;
    private Triangle triangle;

    private float[] parsedNumbers;

    public TriangleApp(){
        triangle = new Triangle();
        parsedNumbers = new float[3];
        isExit = false;
    }

    public boolean runApp(String input) {
        if(parseInput(input)) {
            Log.i("INFO", Arrays.toString(parsedNumbers));
            if(!triangle.validTriangle(parsedNumbers)) { // valid input, but triangle inequality theorem violated
                errMessage = "Invalid triangle. The sum of any two sides must be greater than the third.\n Try again.";
            }
            else {  // valid input, set output to triangle type
                output = triangle.triangleType(parsedNumbers);
                return true;
            }
        }
        return false;
    }

    public String getErrMessage(){
        return errMessage;
    }
    public float[] getParsedNumbers() { return parsedNumbers; }
    @Override
    public String toString() { return parsedNumbers[0] + " " + parsedNumbers[1] + " " + parsedNumbers[2]; }

    public String getInput(){
        return this.input;
    }

    public boolean checkExit(){
        return isExit;
    }
    public void setInput(String input){
        this.input = input;
    }
    public String getOutput(){
        String output = this.output;
        return output;
    }


    public  boolean parseInput(String input)  {
        if (input.length()==1 && input.charAt(0)=='0'){
            errMessage = "Exit Code";
            parsedNumbers = new float[3];
            this.isExit = true;
            return false;
        }
        String num ="";
        int index = 0;
        for(int i =0; i<input.length();i++){
            if (index == 3){
                errMessage = "Input contains more than 3 numbers. \nTry again.";
                parsedNumbers = new float[3];
                return false;
            }
            char currDigit = input.charAt(i);
            if(currDigit == ','|| currDigit ==' '){
                if (num.length() == 0){
                    errMessage = "Invalid input. \nTry again.";
                    parsedNumbers = new float[3];
                    return false;
                }
                try {
                    parsedNumbers[index] = Float.parseFloat(num);
                }
                catch(Exception e) {
                    errMessage = "Invalid input. \nTry again.";
                    parsedNumbers = new float[3];
                    return false;
                }
                if (parsedNumbers[index] < 1.0f) {
                    errMessage = "An input number is less than the minimum value of 1.0. \nTry again.";
                    parsedNumbers = new float[3];
                    return false;
                }
                else if (parsedNumbers[index] > 100.0f) {
                    errMessage = "An input number is greater than the maximum value of 100.0. \nTry again.";
                    parsedNumbers = new float[3];
                    return false;
                }
                num ="";
                index++;
            }
            else if (currDigit == '-' && num.length() == 0) {
                errMessage = "An input number is less than the minimum value of 1.0. \nTry again.";
                parsedNumbers = new float[3];
                return false;
            }
            else if(!Character.isDigit(currDigit) && currDigit != '.') {
                errMessage = "Invalid input. \nTry again.";
                parsedNumbers = new float[3];
                return false;
            }
            else{
                 num = num + currDigit;
            }
        }
        if (index <= 2) {
            if (num.length() <= 0 || index < 2) {
                errMessage = "Invalid input contains less than 3 inputs. \nTry again.";
                parsedNumbers = new float[3];
                return false;
            }
            try {
                parsedNumbers[index] = Float.parseFloat(num);
            }
            catch(Exception e) {
                errMessage = "Invalid input. \nTry again.";
                parsedNumbers = new float[3];
                return false;
            }
        }
        return true;
    }


}
