package com.example.android.stargatequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    public void eval(View view) {

        //Read out the buttons, boxes, edittexts
        CheckBox Q2_1 = (CheckBox) findViewById(R.id.notify_me_checkbox2);
        boolean Q2_1r = Q2_1.isChecked();
        CheckBox Q2_2 = (CheckBox) findViewById(R.id.notify_me_checkbox2);
        boolean Q2_2r = Q2_2.isChecked();
        CheckBox Q2_3 = (CheckBox) findViewById(R.id.notify_me_checkbox3);
        boolean Q2_3r = Q2_3.isChecked();
        CheckBox Q2_4 = (CheckBox) findViewById(R.id.notify_me_checkbox4);
        boolean Q2_4r = Q2_4.isChecked();
        CheckBox Q2_5 = (CheckBox) findViewById(R.id.notify_me_checkbox5);
        boolean Q2_5r = Q2_5.isChecked();
        CheckBox Q7_6 = (CheckBox) findViewById(R.id.notify_me_checkbox6);
        boolean Q7_6r = Q7_6.isChecked();
        CheckBox Q7_7 = (CheckBox) findViewById(R.id.notify_me_checkbox7);
        boolean Q7_7r = Q7_7.isChecked();
        CheckBox Q7_8 = (CheckBox) findViewById(R.id.notify_me_checkbox8);
        boolean Q7_8r = Q7_8.isChecked();
        CheckBox Q7_9 = (CheckBox) findViewById(R.id.notify_me_checkbox9);
        boolean Q7_9r = Q7_9.isChecked();
        CheckBox Q7_10 = (CheckBox) findViewById(R.id.notify_me_checkbox10);
        boolean Q7_10r = Q7_10.isChecked();

        RadioButton Q1_1 = (RadioButton) findViewById(R.id.yes_radio_button_1);
        boolean Q1_1r = Q1_1.isChecked();
        RadioButton Q1_2 = (RadioButton) findViewById(R.id.no_radio_button_1);
        boolean Q1_2r = Q1_2.isChecked();
        RadioButton Q4_1 = (RadioButton) findViewById(R.id.yes_radio_button_2);
        boolean Q4_1r = Q4_1.isChecked();
        RadioButton Q4_2 = (RadioButton) findViewById(R.id.no_radio_button_2);
        boolean Q4_2r = Q4_2.isChecked();
        RadioButton Q5_1 = (RadioButton) findViewById(R.id.yes_radio_button_3);
        boolean Q5_1r = Q5_1.isChecked();
        RadioButton Q5_2 = (RadioButton) findViewById(R.id.no_radio_button_3);
        boolean Q5_2r = Q5_2.isChecked();
        RadioButton Q9_1 = (RadioButton) findViewById(R.id.yes_radio_button_4);
        boolean Q9_1r = Q9_1.isChecked();
        RadioButton Q9_2 = (RadioButton) findViewById(R.id.no_radio_button_4);
        boolean Q9_2r = Q9_2.isChecked();

        EditText Q3 = (EditText) findViewById(R.id.first);
        String Q3_r = Q3.getText().toString();
        EditText Q6 = (EditText) findViewById(R.id.second);
        String Q6_r = Q6.getText().toString();
        EditText Q8 = (EditText) findViewById(R.id.third);
        String Q8_r = Q8.getText().toString();

        int score = 0;

        if(Q1_2r == true){
            score = score + 1;
        }
        if(Q4_2r == true){
            score = score + 1;
        }
        if(Q5_2r == true){
            score = score + 1;
        }
        if(Q9_2r == true){
            score = score + 1;
        }
        if(Q2_1r == true && Q2_2r == true && Q2_4r == true && Q2_5r == true){
            score = score + 1;
        }
        if(Q7_6r == true && Q7_8r == true && Q7_9r == true){
            score = score + 1;
        }

        if(Q3_r.contentEquals("RA")){
            score = score + 1;
        }
        if(Q6_r.contentEquals("1928")){
            score = score + 1;
        }
        if(Q8_r.contentEquals("39")){
            score = score + 1;
        }

        Toast.makeText(MainActivity.this, "Your score: " + score + "/9", Toast.LENGTH_LONG).show();
    }




}
