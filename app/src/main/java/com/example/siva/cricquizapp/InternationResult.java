package com.example.siva.cricquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InternationResult extends AppCompatActivity {
    International inter = new International();
    public int number = inter.getInt();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internation_result);
        TextView text = (TextView) findViewById(R.id.result);
        text.setText("Your Score is "+number+" out of 10");
    }

    public void backR(View view)
    {
        number = 0;
        Intent international = new Intent(InternationResult.this, list.class);
        startActivity(international);
    }


}
