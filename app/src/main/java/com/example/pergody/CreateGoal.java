package com.example.pergody;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

//import com.google.gson.Gson;

public class CreateGoal extends AppCompatActivity implements CalendarView.OnDateChangeListener{

    EditText goalname;
    EditText description;
    EditText plan;
    CalendarView calendar;

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        goalname = (EditText) findViewById(R.id.newgoal);
        description = (EditText) findViewById(R.id.descrip);
        plan = (EditText) findViewById(R.id.planning);
        calendar = (CalendarView) findViewById(R.id.calendar_enter);
        calendar.setOnDateChangeListener((CalendarView.OnDateChangeListener) this);


    }
    public void SavedGoal(View view) {
        Intent intent = new Intent (this, DisplayGoal.class);

        Data data = new Data(getApplication(), "data", null, 1);
        SQLiteDatabase db = data.getWritableDatabase();
        String sql = "Insert into data" +
                "(NameGoal, Description, Plan, Deadline) values("+
                goalname.getText()+
                description.getText()+
                plan.getText()+
                calendar.getDate() +")";

        String v_goal = goalname.getText().toString();
        String v_description = description.getText().toString();
        String v_plan = plan.getText().toString();
        String v_calendar = calendar.toString();

        intent.putExtra("Name: ", v_goal);
        intent.putExtra("Description: ", v_description);
        intent.putExtra("Plan: ", v_plan);
        intent.putExtra("Calendar: ", v_calendar);

        startActivity(intent);

    }

    @Override
    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

    }


    //public void saveFile(View view) {
    //    Data data = new Data(goalname.getText().toString(),
                //description.getText().toString(),
                //plan.getText().toString());

        //Gson gson = new Gson();
        ///String json = gson.toJson(data);






}
