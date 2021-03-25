package com.example.pergody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayGoal extends AppCompatActivity {

    String goal;
    String description;
    String plan;
    String calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_goal);

        Intent intent = getIntent();
        goal = intent.getStringExtra("Name");
        description = intent.getStringExtra("Description");
        plan = intent.getStringExtra("Plan");
        calendar = intent.getStringExtra("Calendar");

        TextView v_goal = findViewById(R.id.goal_view);
        v_goal.setText(goal);
        TextView v_description = findViewById(R.id.description_view);
        v_description.setText(description);
        TextView v_plan = findViewById(R.id.plan_view);
        v_plan.setText(plan);
        TextView v_calendar = findViewById(R.id.calendar_view);
        v_calendar.setText(calendar);
    }
}