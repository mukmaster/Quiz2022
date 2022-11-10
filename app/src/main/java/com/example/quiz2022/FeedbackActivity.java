package com.example.quiz2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        Intent intent = getIntent();
        String feedback = intent.getStringExtra("fb");
        String pointstr = intent.getStringExtra("pstr");
        int points = intent.getIntExtra("pts", 0);

        TextView feedbackView = (TextView) findViewById(R.id.textViewFeedback);
        feedbackView.setText(feedback);

        TextView pointsView = (TextView)  findViewById(R.id.textViewPoints);
        pointsView.setText(pointstr);

    }

    public void btn_clicked(View v) {
        Intent intent = new Intent(this,StartActivity.class);
        startActivity(intent);
    }




}