package com.example.triangleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText inputText;
    private TextView messageText;
    private TriangleApp triangleApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize classes here
        triangleApp = new TriangleApp();

        //initialize widgets below
        //the R.id.{variable name} values are in activity_main.xml
        messageText = (TextView)findViewById(R.id.text_view);
        button = (Button) findViewById(R.id.button);
        inputText = (EditText)findViewById(R.id.edit_text);

        //set initial info message
        messageText.setText(triangleApp.getInfo());

        //set up onclick for button
        button.setOnClickListener( new View.OnClickListener(){
          @Override
          public void onClick(View v){
              //get input string
              String input;
              input = inputText.getText().toString();
              Log.i("INFO",input);
              //Pass in input here
              boolean validInput = triangleApp.parseInput(input);
              if(!validInput){
                  //Display error message here
                  Log.i("INFO",String.valueOf(triangleApp.checkExit()));
                  if(triangleApp.checkExit()){
                      //exit android app
                      finish();
                      System.exit(0);
                  }
              }else{
                  //triangle.checkExit()
                  // run app here
                  //output = triangleApp.runApp();
                  //update message box here
                  // messageText.setText(output);
              }

          }
        });

    }
}