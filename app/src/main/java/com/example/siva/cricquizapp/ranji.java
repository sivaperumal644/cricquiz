package com.example.siva.cricquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class ranji extends AppCompatActivity {
    public static int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranji);
        number=0;
    }
    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option1_31:
                if (checked)
                    number = number + 1;
                break;
        }
    }

    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option2_22:
                if (checked)
                    number = number + 1;
                break;
        }
    }
    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option3_23:
                if (checked)
                    number = number+1;
                break;
        }
    }
    public void onRadioButtonClicked4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option4_44:
                if (checked)
                    number = number+1;
                break;
        }
    }

    public void onRadioButtonClicked5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option5_35:
                if (checked)
                    number = number+1;
                break;
        }
    }
    public void submit(View view)
    {
        Intent ranji = new Intent(ranji.this, RanjiResult.class);
        startActivity(ranji);
    }

    public void back(View view)
    {
        number = 0;
        Intent ipl = new Intent(ranji.this, MainActivity.class);
        startActivity(ipl);
    }
    public int getIntI() { return number; }
}
