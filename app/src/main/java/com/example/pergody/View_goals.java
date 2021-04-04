package com.example.pergody;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pergody.database.Goal;
import com.example.pergody.utility.Utility;

import java.util.ArrayList;

public class View_goals extends AppCompatActivity {

    ListView listViewGoal;


    ArrayList<String> listInformation;
    ArrayList<Goal> listGoal;

    ConectionSQLiteHelper conn;
    private Object SQLiteDatabase;

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goal_list);

        conn = new ConectionSQLiteHelper(getApplicationContext(),"db_goal", null, 1);

        listViewGoal = (ListView) findViewById(R.id.listViewGoal);
        
        consultListGoal();

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listInformation);
        listViewGoal.setAdapter(adapter);
    }

    private void consultListGoal() {

        SQLiteDatabase db = conn.getReadableDatabase();
        Goal goal = null;
        listGoal = new ArrayList<Goal>();

        Cursor cursor = db.rawQuery("SELECT * FROM "+ Utility.GOAL_TABLE,null);

        while (cursor.moveToNext()){
            //goal=new Goal();
            goal.setName(cursor.getString(0));
            goal.setDescription(cursor.getString(1));
            goal.setPlan(cursor.getString(2));
            goal.setCalendar(cursor.getString(3));

            listGoal.add(goal);
        }

        getList();
    }

    private void getList() {
        listInformation = new ArrayList<String>();

        for (int i=0; i<listGoal.size();i++){
            listInformation.add(listGoal.get(i).getName()+" - "
                    +listGoal.get(i).getDescription()+" - "+listGoal.get(i).getPlan()+" - "+listGoal.get(i).getCalendar());
        }
    }


}




