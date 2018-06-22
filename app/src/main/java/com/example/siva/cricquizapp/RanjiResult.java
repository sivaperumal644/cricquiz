package com.example.siva.cricquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RanjiResult extends AppCompatActivity {
    ranji inter = new ranji();
    public int numberranji = inter.getIntI();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranji_result);
        TextView text = (TextView) findViewById(R.id.result);
        text.setText("Your Score is "+numberranji+" out of 5");
    }
    public void backR(View view)
    {
        numberranji = 0;
        Intent international = new Intent(RanjiResult.this, list.class);
        startActivity(international);
    }
}
