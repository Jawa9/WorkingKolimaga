package com.example.olchi.u007test5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }
    public void onActivityBack(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
