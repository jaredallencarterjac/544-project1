package com.example.triangleapp;

public class TriangleApp {
    private String input;
    private String output;
    private String errMessage;
    private boolean isExit;

    private final String INFO = "Input the lengths of the 3 sides to your triangle: ex. 3 5 7. Press return/enter when done\n" +
            "To stop the program press 0 to stop the program";
    private float[] parsedNumbers;

    public TriangleApp(){
        parsedNumbers = new float[3];
        isExit =false;
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
    public float[] getParsedNumbers() { return parsedNumbers; }
    @Override
    public String toString() { return parsedNumbers[0] + " " + parsedNumbers[1] + " " + parsedNumbers[2]; }

    public String getInput(){
        return this.input;
    }

    public boolean checkExit(){
        return isExit;
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
                errMessage = "Input contains more than 3 numbers.";
                parsedNumbers = new float[3];
                return false;
            }
            char currDigit = input.charAt(i);
            if(currDigit == ','|| currDigit ==' '){
                if (num.length() == 0){
                    errMessage = "Invalid input";
                    parsedNumbers = new float[3];
                    return false;
                }
                parsedNumbers[index] = Float.parseFloat(num);
                if (parsedNumbers[index] < 1.0f) {
                    errMessage = "An input number is less than the minimum value of 1.0";
                    parsedNumbers = new float[3];
                    return false;
                }
                else if (parsedNumbers[index] > 100.0f) {
                    errMessage = "An input number is greater than the maximum value of 100.0";
                    parsedNumbers = new float[3];
                    return false;
                }
                num ="";
                index++;
            }
            else if(!Character.isDigit(currDigit) && currDigit != '.'){
                errMessage = "Invalid input";
                parsedNumbers = new float[3];
                return false;
            }
            else{
                 num = num + currDigit;
            }
        }
        if (index <= 2) {
            if (num.length() <= 0 || index < 2) {
                errMessage = "Invalid input";
                parsedNumbers = new float[3];
                return false;
            }
            parsedNumbers[index] = Float.parseFloat(num);
        }
        return true;
    }

    public void setInput(String input){
        this.input = input;
    }
    public String getOutput(){
        String output = this.output;

        return output;
    }
}
