package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn= (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             EditText FirstNumeditText=(EditText) findViewById(R.id.FirstNumeditText);
             EditText SecondNumeditText=(EditText) findViewById(R.id.SecondNumeditText);
                TextView ResulttextView=(TextView) findViewById(R.id.ResulttextView);


                int num1= Integer.parseInt(FirstNumeditText.getText().toString());
                int num2= Integer.parseInt(SecondNumeditText.getText().toString());
                int result= num1 + num2;
                ResulttextView.setText(result + "");
            }
        });
    }
}
