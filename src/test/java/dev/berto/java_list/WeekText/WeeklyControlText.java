package dev.berto.java_list.WeekText;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.berto.java_list.WeeklyControl.WeeklyControl;

public class WeeklyControlText {

    @Test
    @DisplayName("Test to create the list of the week")
    public void testCreateDayList() {
        WeeklyControl week = new WeeklyControl();
        week.createDayList();

        assertThat(week.getdayListOfWeek(), containsInAnyOrder(
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    };

    @Test
    @DisplayName("Test to get the days of the week")
    public void testGetDayListOfWeek() {
        WeeklyControl week = new WeeklyControl();
        week = new WeeklyControl();
        week.createDayList();
        List<String> days = week.getdayListOfWeek();
        assertThat(days, contains(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));         
    }

    @Test
    @DisplayName("Test to get a specific day of the week")
    public void testGetSpecificDayOfWeek() {
        WeeklyControl week = new WeeklyControl();
        week.createDayList();

        assertThat(week.getSpecificDayOfWeek("Thursday"), is(equalTo("Thursday")));
        assertThat(week.getSpecificDayOfWeek("Coche"), is(nullValue()));
    }

    @Test
    @DisplayName("Test to sort the list of the week")
    public void testSortList() {
        WeeklyControl week = new WeeklyControl();
        week.createDayList();
        week.sortList();

        assertThat(week.getdayListOfWeek(), contains(
            "Friday", "Monday", "Saturday", "Sunday", "Thursday", "Tuesday", "Wednesday"));
    }

    @Test
    @DisplayName("Test to check if a day exists in the list")
    public void testDayExists() {
        WeeklyControl week = new WeeklyControl();
        week.createDayList();

        assertThat(week.dayExists("Thursday"), is(true));
        assertThat(week.dayExists("Coche"), is(false));
    }

    @Test
    @DisplayName("Test to delete a day from the list")
    public void testDeleteDay() {
        WeeklyControl week = new WeeklyControl();
        week.createDayList();
        week.deleteDay("Thursday");

        assertThat(week.getdayListOfWeek(), containsInAnyOrder(
            "Monday", "Tuesday", "Wednesday", "Friday", "Saturday", "Sunday"));
    }

    @Test
    @DisplayName("Test to clean the list of the week")
    public void testCleanList() {
        WeeklyControl week = new WeeklyControl();
        week.createDayList();
        week.cleanList();

        assertThat(week.getdayListOfWeek().size(), is(equalTo(0)));
    }

    @Test
    @DisplayName("Test to get the size of the list of the week")
    public void testGetSizeListOfWeek() {
        WeeklyControl week = new WeeklyControl();
        week.createDayList();

        assertThat(week.getSizeListOfWeek(), is(equalTo(7)));
    }
}


