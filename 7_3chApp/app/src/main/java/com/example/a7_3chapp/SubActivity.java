package com.example.a7_3chapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        Log.i("lifeCycleSmaple", "Sub onCreate() called.");
    }

    @Override
    public void onStart(){
        Log.i("lifeCycleSmaple", "Sub onStart() called.");
        super.onStart();
    }

    @Override
    public void onDestroy(){
        Log.i("lifeCycleSmaple", "Sub onDestroy() called.");
        super.onDestroy();
    }

    @Override
    public void onResume(){
        Log.i("lifeCycleSmaple", "Sub onResume() called.");
        super.onResume();
    }

    @Override
    public void onPause(){
        Log.i("lifeCycleSmaple", "Sub onPause() called.");
        super.onPause();
    }

    @Override
    public void onStop(){
        Log.i("lifeCycleSmaple", "Sub onStop() called.");
        super.onStop();
    }

    @Override
    public void onRestart(){
        Log.i("lifeCycleSmaple", "Sub onRestart() called.");
        super.onRestart();
    }
    public void onButtonClick(View view){
        finish();
    }
}