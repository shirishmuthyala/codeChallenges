public class Main {
    public static void main(String[] args) {

        getDurationString(65, 45);

        getDurationString(3945);

    }

    public static int getDurationString(int minutes, int seconds) {
        if(minutes < 0 && (seconds < 0 || seconds > 59)){
            System.out.println("invalid value");
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(hours + "h" + remainingMinutes + "m" + seconds + "s");
        return hours;

    }
    public static int getDurationString(int seconds){
        if(seconds < 0){
            System.out.println("invalid value");
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        getDurationString(minutes, remainingSeconds);
        return minutes;
    }
}
