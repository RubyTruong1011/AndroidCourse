package com.example.widgetsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    CheckBox box1, box2;
    Button btn;
    RadioGroup radioGroup;
    Spinner spinner;
//    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CheckBox
        box1 = findViewById(R.id.checkBox);
        box2 =findViewById(R.id.checkBox2);
        
//        Radio Button
//        radioButton1 = findViewById(R.id.radioBtn1);
//        radioButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "With Delivery option selected", Toast.LENGTH_SHORT).show();
//            }
//        });

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checked) {
                RadioButton radioButton = findViewById(checked);
                Toast.makeText(MainActivity.this, "Selected: " + radioButton.getText(), Toast.LENGTH_LONG).show();

            }
        });

//        Spinner
        spinner = findViewById(R.id.spinner);

        String[] courses = {"C++", "Java", "Kotlin", "Data Structure"};
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, courses);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(ad);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You select: " + courses[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//        Time Picker
//        timePicker = findViewById(R.id.timePicker);
//        timePicker.setIs24HourView(true);


//        Progress Bar
        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(50);
//        progressBar.incrementProgressBy();



        
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //        Getting Selected time
//                String currentTime = "Time: " + timePicker.getCurrentHour() + " : " + timePicker.getCurrentMinute();
//                Toast.makeText(getApplicationContext(), "" + currentTime, Toast.LENGTH_SHORT).show();

//                Increasing progress by 10%
                progressBar.incrementProgressBy(10);


                if(box1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Cheese Topping is added", Toast.LENGTH_SHORT).show();
                } else {
                    
                }
                if(box2.isChecked()) {
                    Toast.makeText(MainActivity.this, "Tomato Topping is added", Toast.LENGTH_SHORT).show();
                    
                }
            }
        });
    }
}