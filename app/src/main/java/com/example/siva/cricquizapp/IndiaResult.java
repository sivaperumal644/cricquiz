package com.example.siva.cricquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IndiaResult extends AppCompatActivity {
    India inter = new India();
    public int numberIndia = inter.getIntI();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_result);
        TextView text = (TextView) findViewById(R.id.result);
        text.setText("Your Score is "+numberIndia+" out of 10");
    }
    public void backR(View view)
    {
        numberIndia = 0;
        Intent international = new Intent(IndiaResult.this, list.class);
        startActivity(international);
    }
}
