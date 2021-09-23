package com.example.triangleapp;

import android.util.Log;

import java.util.ArrayList;

public class TriangleApp {
    private String input;
    private String output;
    private String errMessage;
    private static String INFO;

    public TriangleApp(){
        INFO = "Input the lengths of the 3 sides to your triangle: ex. 3 5 7. Press return/enter when done\n" +
                "To stop the program press 0 to stop the program";
    }
    public String getInfo(){
        return this.INFO;
    }
    public String runApp(){
        return "App is running";
    }
    public String getErrMessage(){
        return errMessage;
    }

    public String getInput(){
        return this.input;
    }

    public  float[] parseInput(String input)  {
        float[] sides = new float[3];
        int index = 0;
        if (input.length()==1 && input.charAt(0)=='0'){
            return new float[]{0,0,0};
        }
        String num ="";
        for(int i =0; i<input.length();i++){
            if (index ==3){
                //throw error message
            }

            char digit = input.charAt(i);
            if(digit == ','||digit ==' '){
                if(num.length() == 0){
                    //throw error message

                }

                System.out.println("Num is "+ num);
                sides[index] = Float.parseFloat(num);

                num ="";
                index++;
            }
            else if(!Character.isDigit(digit)){
                //throw an error message
            }
            else{
                 num= num+digit;
            }
        }
        sides[index] = Float.parseFloat(num);
        return sides;
    }



    public void setInput(String input){
        this.input = input;
    }
    public String getOutput(){
        String output = this.output;

        return output;
    }
}
