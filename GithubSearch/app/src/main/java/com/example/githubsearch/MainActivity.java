package com.example.githubsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usernm;
    Button searchbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernm=(EditText)findViewById(R.id.username);
        searchbtn=(Button)findViewById(R.id.search);
        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=usernm.getText().toString();
                if(TextUtils.isEmpty(username)){
                    Toast.makeText(MainActivity.this, "Enter the valid username", Toast.LENGTH_SHORT).show();
                }
                else
                {
                Intent intent=new Intent(MainActivity.this,profile.class);
                intent.putExtra("Username",username);
                startActivity(intent);
            }
            }
        });
    }
}