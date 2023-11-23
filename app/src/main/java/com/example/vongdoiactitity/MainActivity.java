package com.example.vongdoiactitity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvhello;
    private static String TAG="MainActivity";
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart:");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart:");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop:");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy:");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause:");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume:");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate:");
    }
}
