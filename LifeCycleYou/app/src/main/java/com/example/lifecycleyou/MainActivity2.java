package com.example.lifecycleyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
private Button mbtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mbtn1=findViewById(R.id.btn1);
        Log.d("Tag", "onCreate: ");
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Tag","onStart:");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Tag", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Tag", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Tag", "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Tag", "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Tag", "onDestroy: ");
    }
}