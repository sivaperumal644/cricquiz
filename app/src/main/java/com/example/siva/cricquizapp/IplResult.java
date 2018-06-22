package com.example.siva.cricquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IplResult extends AppCompatActivity {
    Ipl inter = new Ipl();
    public int numberipl = inter.getIntI();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipl_result);
        TextView text = (TextView) findViewById(R.id.result);
        text.setText("Your Score is "+numberipl+" out of 15");
    }
    public void backR(View view)
    {
        numberipl = 0;
        Intent international = new Intent(IplResult.this, list.class);
        startActivity(international);
    }
}
