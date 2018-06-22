package com.example.siva.cricquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        TextView international = (TextView) findViewById(R.id.international);

// Set a click listener on that View
        international.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent international = new Intent(list.this, International.class);
                startActivity(international);
            }
        });

        TextView india = (TextView) findViewById(R.id.india);

// Set a click listener on that View
        india.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent india = new Intent(list.this, India.class);
                startActivity(india);
            }
        });
        TextView ipl = (TextView) findViewById(R.id.ipl);

// Set a click listener on that View
        ipl.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ipl = new Intent(list.this, Ipl.class);
                startActivity(ipl);
            }
        });
        TextView ranjiT = (TextView) findViewById(R.id.ranji);

// Set a click listener on that View
        ranjiT.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ranjiTr = new Intent(list.this, ranji.class);
                startActivity(ranjiTr);
            }
        });
        TextView vijayH = (TextView) findViewById(R.id.vijay);

// Set a click listener on that View
        vijayH.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent vijayHa = new Intent(list.this, vijay.class);
                startActivity(vijayHa);
            }
        });

    }
    public void backL(View view)
    {
        Intent backl = new Intent(list.this, MainActivity.class);
        startActivity(backl);
    }
}
