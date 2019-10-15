package com.naufalr.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambah3PoinA(View view) {
        scoreA =scoreA + 3;
        TextView textviewA = findViewById(R.id.scoreA);
        textviewA.setText(String.valueOf(scoreA));
    }
}
