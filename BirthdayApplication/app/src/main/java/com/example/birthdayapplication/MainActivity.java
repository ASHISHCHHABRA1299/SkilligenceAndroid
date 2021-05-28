package com.example.birthdayapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button createcard;
    EditText nameoncard;
    String name="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createcard=(Button)findViewById(R.id.create);
        nameoncard=(EditText)findViewById(R.id.name);
        createcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=nameoncard.getText().toString();
                Intent i=new Intent(MainActivity.this,birthday.class);
                i.putExtra("birthdayname",name);
                startActivity(i);
            }
        });

    }
}