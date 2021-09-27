package com.example.triangleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText inputText;
    private TextView infoText;
    private TextView outputText;
    private TriangleApp triangleApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize classes here
        triangleApp = new TriangleApp();

        //initialize widgets below
        //the R.id.{variable name} values are in activity_main.xml
        button = (Button) findViewById(R.id.button);
        infoText = (TextView)findViewById(R.id.text_info);
        inputText = (EditText)findViewById(R.id.edit_text);
        outputText = (TextView)findViewById(R.id.text_output);

        //set up onclick for button
        button.setOnClickListener( new View.OnClickListener(){
          @Override
          public void onClick(View v){
              // Close virtual keyboard
              inputText.onEditorAction(EditorInfo.IME_ACTION_DONE);
              String input = inputText.getText().toString();
              // run app
              boolean success = triangleApp.runApp(input);
              // Edge case, app exit
              if(triangleApp.checkExit()) {
                  infoText.setText("The End");
                  outputText.setVisibility(View.INVISIBLE);
              }
              else if(success) {
                  outputText.setText(triangleApp.getOutput());
                  outputText.setTextColor(getResources().getColor(R.color.blue));
                  outputText.setVisibility(View.VISIBLE);
              }
              else {
                  outputText.setText(triangleApp.getErrMessage());
                  outputText.setTextColor(getResources().getColor(R.color.red));
                  outputText.setVisibility(View.VISIBLE);
              }
          }
        });

    }
}