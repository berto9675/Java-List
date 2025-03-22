package dev.berto.java_list.WeeklyControl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyControl {

    public List<String> dayListOfWeek = new ArrayList<>();

    public void createDayList() {
        
        dayListOfWeek.add("Monday");
        dayListOfWeek.add("Tuesday");
        dayListOfWeek.add("Wednesday");
        dayListOfWeek.add("Thursday");
        dayListOfWeek.add("Friday");
        dayListOfWeek.add("Saturday");
        dayListOfWeek.add("Sunday");
    }

    
    public List<String> getdayListOfWeek() {
        return dayListOfWeek;
    }

    
    public int getSizeListOfWeek() {
        return dayListOfWeek.size();
    }
   
   
    public String getSpecificDayOfWeek(String day) {
        return dayListOfWeek.contains(day) ? day : null;
    }
    public void sortList() {
        Collections.sort(dayListOfWeek);
    }

    public boolean dayExists(String day) {
        return dayListOfWeek.contains(day);
    }
    
    public void deleteDay(String day) {
        dayListOfWeek.remove(day);
    }

    public void cleanList() {
        dayListOfWeek.clear();
    }
}
