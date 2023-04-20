package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox box1, box2;
    Button btn;
//    RadioButton radioButton;
    RadioGroup radioGroup;

    Spinner spinner;

    TimePicker timePicker;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Check Box
        box1 = findViewById(R.id.checkbox1);
        box2 = findViewById(R.id.checkbox2);

        //        Radio Button
//        radioButton = findViewById(R.id.radioButton);
//        radioButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "With Delivery option selected", Toast.LENGTH_SHORT).show();
//            }
//        });

//        Radio Group
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                RadioButton radioButton = findViewById(checked);
                Toast.makeText(MainActivity.this, "Selected "+ radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

//        Spinner
        spinner = findViewById(R.id.spinner);
        String[] courses = {"C++", "Java", "Kotlin", "Data Structure"};

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, courses);

        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(ad);
//How to handle the click events on the spinner items
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You select: "+ courses[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

////Time Picker
//        timePicker = findViewById(R.id.timePicker);
//        timePicker.setIs24HourView(true);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Display the time picker
                DialogFragment timePickerFrag = new TimePickerFragment();

                timePickerFrag.show(getSupportFragmentManager(), "Pick Time Now: ");

            }
        });


        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //        Getting selected time
                String currentTime = "Time: " + timePicker.getCurrentHour() + " : " + timePicker.getCurrentMinute();
                Toast.makeText(getApplicationContext(), "" + currentTime, Toast.LENGTH_LONG).show();

                if (box1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Cheese Topping is added", Toast.LENGTH_LONG).show();
                } else {

                }
                if (box2.isChecked()) {
                    Toast.makeText(MainActivity.this, "Tomato Topping is added", Toast.LENGTH_LONG).show();
                } else {

                }
            }
        });
        


    }
}