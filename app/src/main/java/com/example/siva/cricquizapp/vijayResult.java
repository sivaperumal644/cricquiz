package com.example.siva.cricquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class vijayResult extends AppCompatActivity {
    vijay inter = new vijay();
    public int numbervijay = inter.getIntI();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vijay_result);
        TextView text = (TextView) findViewById(R.id.result);
        text.setText("Your Score is "+numbervijay+" out of 5");
    }
    public void backR(View view)
    {
        numbervijay = 0;
        Intent vijay = new Intent(vijayResult.this, list.class);
        startActivity(vijay);
    }
}
