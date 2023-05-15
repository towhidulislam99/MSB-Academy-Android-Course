package com.example.androidlifecycleexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.ET1);


        Log.d("Life Cycle", "onCreate: ");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle", "onStart: ");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Life Cycle", "onRestoreInstanceState: ");
        String s = savedInstanceState.getString("TEXT");
        et.setText(s);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life Cycle", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle", "onPause: ");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("Life Cycle", "onSaveInstanceState: ");
        String input =et.getText().toString();
        outState.putString("TEXT",input);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle", "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle", "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle", "onDestroy: ");
    }
}