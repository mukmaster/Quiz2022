package com.example.quiz2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Q1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
    }

    public void btn_clicked(View v) {
        String feedback;
        String pointstr;
        int points;
        RadioButton rb = (RadioButton) findViewById(R.id.radioButton2);
        if (rb.isChecked()) {
            feedback = "You made it. Right Answer!";
            pointstr = "1 Point for you!";
            points = 1;
        } else {
            feedback = "Wrong Answer.";
            pointstr = "No point this time.";
            points = 0;
        }
        Intent intent = new Intent (this, FeedbackActivity.class);
        intent.putExtra("fb", feedback);
        intent.putExtra("pstr", pointstr);
        intent.putExtra("pts", points);
        startActivity(intent);
    }
}