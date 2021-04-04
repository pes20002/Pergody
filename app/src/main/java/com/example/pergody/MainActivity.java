package com.example.pergody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConectionSQLiteHelper conn = new ConectionSQLiteHelper(this, "db_goal", null,1);
    }

    public void Create(View view) {
        Intent intent = new Intent(this, CreateGoal.class);
        startActivity(intent);
    }

    public void ViewGoal(View view) {
        Intent intent = new Intent(this, View_goals.class);
        startActivity(intent);
    }
}