public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {

    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            float hour = minutes / 60;
            float day = hour / 24;
            int remainingDay = (int) (day % 365);
            int year = (int) day / 365;
            System.out.println(minutes + " min = " + year + " y and " + remainingDay + " d");
        }
    }
}
