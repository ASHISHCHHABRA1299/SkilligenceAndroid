package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button opengithub,openlinkedin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opengithub=(Button)findViewById(R.id.opengtb);
        openlinkedin=(Button)findViewById(R.id.openlnkdn);
        Log.w("message","Till Here");
        opengithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "OPEN GITHUB BUTTON CLICKED", Toast.LENGTH_SHORT).show();
                Log.d("Message","Github Button Clicked");
//                openlinkedin.setVisibility(View.VISIBLE);
                Intent i=new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://github.com/ASHISHCHHABRA1299"));
                startActivity(i);
            }
        });
        openlinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "OPEN LINKEDIN BUTTON CLICKED", Toast.LENGTH_SHORT).show();
                Log.d("Message","Linkedin Button Clicked");
                Intent i=new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.linkedin.com/in/ashish-chhabra-131104156/"));
                startActivity(i);
            }
        });
    }
}