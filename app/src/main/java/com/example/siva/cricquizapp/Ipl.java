package com.example.siva.cricquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Ipl extends AppCompatActivity {
    public static int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipl);
        number=0;
    }
    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option1_41:
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
            case R.id.option3_33:
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
            case R.id.option4_14:
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
            case R.id.option5_25:
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
            case R.id.option7_37:
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
            case R.id.option8_48:
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
            case R.id.option9_29:
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
    public void onRadioButtonClicked11(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option11_311:
                if (checked)
                    number = number + 1;
                break;
        }
    }

    public void onRadioButtonClicked12(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option12_212:
                if (checked)
                    number = number + 1;
                break;
        }
    }
    public void onRadioButtonClicked13(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option13_313:
                if (checked)
                    number = number+1;
                break;
        }
    }
    public void onRadioButtonClicked14(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option14_114:
                if (checked)
                    number = number+1;
                break;
        }
    }

    public void onRadioButtonClicked15(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.option15_115:
                if (checked)
                    number = number+1;
                break;
        }
    }

    public void submit(View view)
    {
        Intent international = new Intent(Ipl.this, IplResult.class);
        startActivity(international);
    }

    public void back(View view)
    {
        number = 0;
        Intent ipl = new Intent(Ipl.this, MainActivity.class);
        startActivity(ipl);
    }
    public int getIntI() { return number; }
}
