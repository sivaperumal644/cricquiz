package com.example.siva.cricquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class India extends AppCompatActivity {
    public static int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);
        number=0;
    }
    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option1_11:
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
            case R.id.option2_42:
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
            case R.id.option3_43:
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
            case R.id.option4_34:
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
            case R.id.option5_15:
                if (checked)
                    number = number+1;
                break;
        }
    }
    public void onRadioButtonClicked6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option6_16:
                if (checked)
                    number = number+1;
                break;
        }
    }
    public void onRadioButtonClicked7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option7_27:
                if (checked)
                    number = number+1;
                break;
        }
    }
    public void onRadioButtonClicked8(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option8_18:
                if (checked)
                    number = number+1;
                break;
        }
    }
    public void onRadioButtonClicked9(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option9_39:
                if (checked)
                    number = number+1;
                break;
        }
    }
    public void onRadioButtonClicked10(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId())
        {
            case R.id.option10_210:
                if (checked)
                    number = number+1;
                break;
        }
    }

    public void submit(View view)
    {
        Intent international = new Intent(India.this, IndiaResult.class);
        startActivity(international);
    }

    public void back(View view)
    {
        number = 0;
        Intent international = new Intent(India.this, MainActivity.class);
        startActivity(international);
    }
    public int getIntI() { return number; }
}
