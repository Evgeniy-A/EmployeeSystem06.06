package kata.oop.metod;

public class Task228 {

    public boolean isWeekend (String dayName) {
        return dayName.equalsIgnoreCase("Sunday") ||
                dayName.equalsIgnoreCase("Saturday");
    }
    int weekendCount(String[] days) {
        int count = 0;
        for (int i = 0; i < days.length; i++) {
            if (isWeekend(days[i])) {
                count++;
            }
        }
        return count;
    }
    int weekdayCount(String[] days) {
        return days.length - weekendCount(days);
    }



}
