package com.example.pergody.utility;

public class Utility {

    public static final String GOAL_TABLE = "Goal";
    public static final String NAME_TAG = "name";
    public static final String DESCRIPTION_TAG = "description";
    public static final String PLAN_TAG = "plan";
    public static final String CALENDAR_TAG = "calendar";

    public static final String CREATE_TABLE_GOAL = "CREATE TABLE " + GOAL_TABLE + " ("+NAME_TAG+" TEXT, "+DESCRIPTION_TAG+" TEXT, "+PLAN_TAG+" TEXT, "+CALENDAR_TAG+" TEXT)";
}
