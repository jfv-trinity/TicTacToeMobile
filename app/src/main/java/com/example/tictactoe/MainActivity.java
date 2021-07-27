package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void print_onClick(View v){
        Intent activityToBe = null;

        switch (v.getId()){
            case R.id.SinglePlayerBtn:
                activityToBe = new Intent(this, GameActivity.class);
                break;
            case R.id.MultiplayerBtn:
                activityToBe = new Intent(this, GameActivity.class);
                break;
            case R.id.Exit:
                System.exit(0);
        };
        startActivity(activityToBe);
    }
}