package com.example.olchi.u007test5;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAlert = (Button)findViewById(R.id.btnAlert);

    }
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Cообщение!")
                .setMessage("Вот эта хрень тоже может работать иногда!!!")
                .setIcon(R.drawable.nim)
                .setCancelable(false)
                .setNegativeButton("Да, Я буду больше работать!!!",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
    public void onClickBtnSmile(View v){

        Button btnSmile = (Button) findViewById(R.id.btnSmile);
        if(btnSmile.getText() == "(-__-)") {
            btnSmile.setText("(O__O)");
        }else btnSmile.setText("(-__-)");

    }
    public void onNewActivity(View v){
        Intent intent = new Intent(this,ActivityTwo.class);
        startActivity(intent);
    }
}
