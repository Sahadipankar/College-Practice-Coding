package Basics;

// Import necessary classes
import java.util.Calendar;
import java.util.TimeZone;

public class Date_Time {
    public static void main(String[] args) {
        // Create an instance of Calendar set to the current date and time
        Calendar current = Calendar.getInstance();

        // Retrieve and store current date and time components
        int year = current.get(Calendar.YEAR);  // Get the current year
        int month = current.get(Calendar.MONTH) + 1; // Month is 0-based, add 1
        int day = current.get(Calendar.DATE);  // Get the current day
        int hour = current.get(Calendar.HOUR);  // Get the current hour
        int minute = current.get(Calendar.MINUTE);  // Get the current minute
        int second = current.get(Calendar.SECOND);  // Get the current second
        int am_pm = current.get(Calendar.AM_PM);  // Get the AM/PM indicator

        // Display the current date and time
        System.out.println("\nCurrent Date and Time:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour + (am_pm == Calendar.AM ? " AM" : " PM"));  // Display AM/PM
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        
        System.out.println("\nTime in 12-hour format: " + hour + ":" + minute + ":" + second + (am_pm == Calendar.AM ? " AM" : " PM"));  // Display time in 12-hour format (AM/PM)

        System.out.println("Time in 24-hour format: " + current.get(Calendar.HOUR_OF_DAY) + ":" + minute + ":" + second + "\n");  // Display time in 24-hour format (0-23)

        // Display the current time zone
        TimeZone timeZone = current.getTimeZone();  // Get the current time zone
        System.out.println("Time Zone: " + timeZone.getDisplayName() + " (" + timeZone.getID() + ")");  // Display time zone

        // Display the day of the week
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};  // Array of days
        System.out.println("Day of the Week: " + days[current.get(Calendar.DAY_OF_WEEK) - 1]);  // Display day of the week

        // Display the week of the year
        System.out.println("Week of the Year: " + current.get(Calendar.WEEK_OF_YEAR));  // Display week of the year

        /*
         * This program demonstrates the use of the Calendar class in Java.
         * It retrieves and displays various components of the current date and time.
         * Additional functionalities include showing the time zone, day of the week,
         * and the week number of the year.
         */
    }
}



// Declares a reference variable current of type Calendar from the java.util package.
// Calendar is a built-in Java class used to work with dates and times.

// java.util.Calendar.getInstance(): This static method creates a new Calendar instance set to the current date and time based on the system clock.
// The returned object is assigned to the current variable.

// The get method of the Calendar object retrieves the specified field.
// java.util.Calendar.YEAR is a constant representing the year field.
// This line stores the current year from the current object into the year variable.

// Prints the string Current Year: followed by the value stored in the year variable to the console.
// System.out.println: Outputs the text with a new line at the end.