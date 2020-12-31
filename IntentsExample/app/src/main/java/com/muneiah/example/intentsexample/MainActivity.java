package com.muneiah.example.intentsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.url_input);
    }

    /*Explicity Intent */
    public void showSecondScreen(View view) {
        Intent intentObject = new Intent(this, SecondActivity.class);
        startActivity(intentObject);
    }

    /*Implicit Intent */
    public void showWebpage(View view) {
        String w = et.getText().toString();
        Uri u = Uri.parse("https:/www." + w);
        Intent i = new Intent(Intent.ACTION_VIEW, u);
        startActivity(i);
    }
}