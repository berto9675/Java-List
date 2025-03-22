package dev.berto.java_list.WeeklyControl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyControl {
    // List of days of the week
    public List<String> dayListOfWeek = new ArrayList<>();

    // List of days
    public void createDayList() {
        // Add days of the week to the list
        dayListOfWeek.add("Monday");
        dayListOfWeek.add("Tuesday");
        dayListOfWeek.add("Wednesday");
        dayListOfWeek.add("Thursday");
        dayListOfWeek.add("Friday");
        dayListOfWeek.add("Saturday");
        dayListOfWeek.add("Sunday");
    }

    // Get the complete list of days.
    public List<String> getdayListOfWeek() {
        return dayListOfWeek;
    }

    //Gets the number of days in the list.
    public int getSizeListOfWeek() {
        return dayListOfWeek.size();
    }
   
    //Gets a specific day if it is listed, or null if it is not.
    public String getSpecificDayOfWeek(String day) {
        return dayListOfWeek.contains(day) ? day : null;
    }

    //Sort the list of days.
    public void sortList() {
        Collections.sort(dayListOfWeek);
    }

    //Check if a day exists in the list.
    public boolean dayExists(String day) {
        return dayListOfWeek.contains(day);
    }
    
    //Remove a specific day from the list.
    public void deleteDay(String day) {
        dayListOfWeek.remove(day);
    }

    //Clean the list, deleting all the days.
    public void cleanList() {
        dayListOfWeek.clear();
    }
}
