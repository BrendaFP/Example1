package com.example.brend.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import  android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNewAct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewAct = findViewById(R.id.my_button);
        btnNewAct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent myIntent = new Intent( MainActivity.this , TargetActivity.class);
                myIntent.putExtra( "stringToSend", "Hello Intent");
                myIntent.putExtra("myInteger",2);
                startActivity(myIntent);
            }
        });
    }
}
