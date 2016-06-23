package com.example.raghav.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private boolean questionOne() {
        RadioButton radioDishes = (RadioButton) findViewById(R.id.radio_dishes);
        RadioButton radioMsPacman = (RadioButton) findViewById(R.id.radio_ms_pacman);

        if (radioMsPacman.isChecked()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean questionTwo() {
        EditText textField = (EditText) findViewById(R.id.spirit_text_field);
        String name = textField.getText().toString();
        Log.v("MainActivity", name);
        if (name.equals("Phoebe")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean questionThree() {
        CheckBox rachelBox = (CheckBox) findViewById(R.id.check_box_rachel);
        CheckBox carolBox = (CheckBox) findViewById(R.id.check_box_carol);
        CheckBox emilyBox = (CheckBox) findViewById(R.id.check_box_emily);
        CheckBox phoebeBox = (CheckBox) findViewById(R.id.check_box_phoebe);

        boolean rachel = rachelBox.isChecked();
        boolean carol = carolBox.isChecked();
        boolean emily = emilyBox.isChecked();

        if (rachel && carol && emily) {
            return true;
        } else {
            return false;
        }
    }

    private boolean questionFour() {
        RadioButton radioDog = (RadioButton) findViewById(R.id.radio_dog);

        if (radioDog.isChecked()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean questionFive() {
        EditText textField = (EditText) findViewById(R.id.janice_text_field);
        String name = textField.getText().toString();

        if (name.equals("Janice")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean questionSix() {
        RadioButton yesButton = (RadioButton) findViewById(R.id.radio_yes);

        if (yesButton.isChecked()) {
            return true;
        } else {
            return false;
        }
    }

    public void submitButtonPressed(View view) {
        int score = 0;

        Log.v("MainActivity","" + questionOne());
        Log.v("MainActivity","" + questionTwo());
        Log.v("MainActivity","" + questionThree());
        Log.v("MainActivity","" + questionFour());
        Log.v("MainActivity","" + questionFive());
        Log.v("MainActivity","" + questionSix());


        if (questionOne()){
            score += 1;
        }

        if (questionTwo()) {
            score += 1;
        }

        if (questionThree()) {
            score += 1;
        }

        if (questionFour()) {
            score += 1;
        }

        if (questionFive()) {
            score += 1;
        }

        if (questionSix()) {
            score += 1;
        }

        Toast.makeText(this, "Your score is: " + score, Toast.LENGTH_LONG).show();
    }

}
