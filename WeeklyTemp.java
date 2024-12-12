// Module 5 Critical Thinking Option 1 - Wyeth Abel

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WeeklyTemp {
    public static void main(String[] args) {
        tempProcess();
    }
    public static void tempProcess() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(52, 56, 59, 54, 63, 65, 60));
        while (true) {
            System.out.println("Enter the three-letter abbreviation for the day to view its temperature,\n" +
                    " or type 'Week' to view all days and the weekly average.");
            String selection = input.next();
            if (selection.equals("Week")) {
                for (int x = 0; x < days.size(); x++) {
                    System.out.println(days.get(x) + ": " + temp.get(x) + "F");
                }
                int total = 0;
                for (int i = 0; i < temp.size(); i++) {
                    total += temp.get(i);
                }
                System.out.println("Weekly Average: " + (total / days.size()) + "F");
                break;
            } else if (days.contains(selection)) {
                System.out.println(selection + ": " + temp.get(days.indexOf(selection)) + "F");
                break;
            } else {
                System.out.println("Please try again");
            }
        }
        input.close();
    }
}
