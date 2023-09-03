package com.example.findyob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText edtDOB;
    private TextView tvShowAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtDOB = (EditText) findViewById(R.id.edtDOB);
        tvShowAge = (TextView) findViewById(R.id.tvShowAge);
    }

    public void btnFindAge(View view) {
        int DOB = Integer.parseInt(edtDOB.getText().toString());
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int Age = year - DOB;
        tvShowAge.setText("Your Age is: " + Age + " " + "and in months " + Age*12 + ", in days" + Age*365);
    }
}