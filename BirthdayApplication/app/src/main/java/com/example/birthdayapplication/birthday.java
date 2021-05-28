package com.example.birthdayapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class birthday extends AppCompatActivity {

    TextView mTextView;
    String name1="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        mTextView=(TextView)findViewById(R.id.bname);
        name1=getIntent().getStringExtra("birthdayname");
        mTextView.setText("HAPPY BIRTHDAY"+"\n"+name1);
    }
}