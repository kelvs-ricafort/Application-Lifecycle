package com.newtechieblog.wordpress.views.applicationlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "MainActivity";

    TextView textView;
    Button button;
    Button button2;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.buttonActivity);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 1;
                textView.setText("" + counter);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);

            }
        });

        Log.d(TAG, "First Activity onCreate Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "First Activity onDestroy Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "First Activity onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "First Activity onStop Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "First Activity onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "First Activity onResume Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "First Activity onRestart Called");
    }
}