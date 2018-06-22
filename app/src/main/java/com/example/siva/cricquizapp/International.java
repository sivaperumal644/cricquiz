package com.example.siva.cricquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class International extends AppCompatActivity {
    public static int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international);
        i = 0;
    }



    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option_31:
                if (checked)
                    i = i+1;
                    break;
        }
    }

    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option_12:
                if (checked)
                    i = i+1;
                break;
        }
    }
    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option_23:
                if (checked)
                    i = i+1;
                break;
        }
    }
    public void onRadioButtonClicked4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option_34:
                if (checked)
                    i = i+1;
                break;
        }
    }

    public void onRadioButtonClicked5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option_25:
                if (checked)
                    i = i+1;
                break;
        }
    }
    public void onRadioButtonClicked6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option_36:
                if (checked)
                    i = i+1;
                break;
        }
    }
    public void onRadioButtonClicked7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option_27:
                if (checked)
                    i = i+1;
                break;
        }
    }
    public void onRadioButtonClicked8(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option_18:
                if (checked)
                    i = i+1;
                break;
        }
    }
    public void onRadioButtonClicked9(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option_49:
                if (checked)
                    i = i+1;
                break;
        }
    }
    public void onRadioButtonClicked10(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId())
        {
            case R.id.option_110:
                if (checked)
                    i = i+1;
                break;
        }
    }

    public void submit(View view)
    {
        Intent international = new Intent(International.this, InternationResult.class);
        startActivity(international);
    }

    public void back(View view)
    {
        i = 0;
        Intent international = new Intent(International.this, MainActivity.class);
        startActivity(international);
    }
    public int getInt() { return i; }
}
