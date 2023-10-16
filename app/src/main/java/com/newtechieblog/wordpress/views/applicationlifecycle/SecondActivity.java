package com.newtechieblog.wordpress.views.applicationlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button btnBack;

    final static String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Log.d(TAG, "Second Activity onCreate Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Second Activity onDestroy Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Second Activity onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Second Activity onStop Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Second Activity onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Second Activity onResume Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Second Activity onRestart Called");
    }
}