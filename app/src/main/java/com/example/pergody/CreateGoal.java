package com.example.pergody;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pergody.utility.Utility;

//import com.google.gson.Gson;

public class CreateGoal extends AppCompatActivity {


    /*public static final String GOAL = "";
    public static final String DESCRIPTION = "";
    public static final String PLAN = "";
    public static final String CALENDAR = "";*/

    EditText goal_name, description, plan, calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        goal_name = (EditText) findViewById(R.id.newgoal);
        description = (EditText) findViewById(R.id.descrip);
        plan = (EditText) findViewById(R.id.planning);
        calendar = (EditText) findViewById(R.id.calendar_enter);
    }

    /** Called when the user taps the Saved button */
    //public void SavedGoal(View view) {

        /*Intent intent = new Intent(this, DisplayGoal.class);
        Bundle extras = new Bundle();

        EditText goal_name = (EditText) findViewById(R.id.newgoal);
        EditText description = (EditText) findViewById(R.id.descrip);
        EditText plan = (EditText) findViewById(R.id.planning);
        EditText calendar = (EditText) findViewById(R.id.calendar_enter);

        String v_goal = goal_name.getText().toString();
        String v_description = description.getText().toString();
        String v_plan = plan.getText().toString();
        String v_calendar = calendar.getText().toString();

        extras.putString("GOAL", v_goal);
        extras.putString("PLAN", v_plan);
        extras.putString("DESCRIPTION", v_description);
        extras.putString("CALENDAR", v_calendar);
        intent.putExtras(extras);

        startActivity(intent);*/

        //Saveddb();
        
        //RegisterGoal();

    public void OnClick(View view){
        SavedGoal();
    }


    public void SavedGoal() {
        ConectionSQLiteHelper conn = new ConectionSQLiteHelper(this, "db_goal", null,1);
        SQLiteDatabase db = conn.getWritableDatabase();

        String insert = "INSERT INTO "+Utility.GOAL_TABLE +" ("+Utility.NAME_TAG+","+Utility.DESCRIPTION_TAG+","+Utility.PLAN_TAG+","+Utility.CALENDAR_TAG+")" +
                "VALUES ('"+goal_name.getText().toString()+"','"+description.getText().toString()+"','"+plan.getText().toString()+"','"+calendar.getText().toString()+" ')";
        db.execSQL(insert);
        db.close();
    }

    /*public void Saveddb(){
        ConectionSqliteHelper conn = new ConectionSqliteHelper(this, "db_goal", null,1);
        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Utility.NAME_TAG, goal_name.getText().toString());
        values.put(Utility.DESCRIPTION_TAG, description.getText().toString());
        values.put(Utility.PLAN_TAG, plan.getText().toString());
        values.put(Utility.CALENDAR_TAG, calendar.getText().toString());

        Long Result =db.insert(Utility.GOAL_TABLE, Utility.NAME_TAG, values);
        db.close();

    }*/


}
