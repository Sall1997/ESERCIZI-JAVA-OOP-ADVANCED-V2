/*
Define a testing class with a main() method where you:

create an HashSet with all the days of the week and print the content of the HashSet
create another implementation of Set that preserves the insertion order of the days of the week and print it
print the new Set
print the answer to the question Is the first Set equal to the second one?*/

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {

        HashSet<String> weekDays = new HashSet<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println(weekDays);

        LinkedHashSet<String> WEEK_DAYS = new LinkedHashSet<>();

        WEEK_DAYS.add("Monday");
        WEEK_DAYS.add("Tuesday");
        WEEK_DAYS.add("Wednesday");
        WEEK_DAYS.add("Thursday");
        WEEK_DAYS.add("Friday");
        WEEK_DAYS.add("Saturday");
        WEEK_DAYS.add("Sunday");

        System.out.println(WEEK_DAYS);

        boolean equal = weekDays == WEEK_DAYS;

        System.out.println("Is the first Set equal to the second one? " + equal);
    }
}