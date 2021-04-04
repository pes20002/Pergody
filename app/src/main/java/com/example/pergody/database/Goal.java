package com.example.pergody.database;

public class Goal {

    private String name;
    private String description;
    private String plan;
    private String calendar;

    public Goal(String name, String description, String plan, String calendar) {
        this.name = name;
        this.description = description;
        this.plan = plan;
        this.calendar = calendar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }
}
