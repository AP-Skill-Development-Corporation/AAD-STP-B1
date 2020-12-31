package com.muneiah.example.activitylifecyles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label = findViewById(R.id.tv);
        label.append("OnCreate()\n");
        Log.i("MainAcivity", "Oncrete()");
        Toast.makeText(this, "App is Created", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        label.append("OnStart()\n");
        Log.i("MainAcivity", "Onstart()");
        Toast.makeText(this, "App is Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        label.append("onResume()\n");
        Log.i("MainAcivity", "onResume()");
        Toast.makeText(this, "App is resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        label.append("onPause()\n");
        Log.i("MainAcivity", "onPause()");
        Toast.makeText(this, "App is Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        label.append("onStop()\n");
        Log.i("MainAcivity", "onStop()");
        Toast.makeText(this, "App is Stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        label.append("onDestroy()\n");
        Log.i("MainAcivity", "onDestroy()");
        Toast.makeText(this, "App is Removed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        label.append("onRestart()\n");
        Log.i("MainAcitivy","OnRestart()");
        Toast.makeText(this, "App is ReStarted", Toast.LENGTH_SHORT).show();
    }
}