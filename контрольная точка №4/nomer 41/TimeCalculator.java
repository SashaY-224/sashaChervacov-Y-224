public class TimeCalculator {
    public static void main(String[] args) {
        int seconds = 3662;
        String time = convertSeconds(seconds);
        System.out.println(time);
    }

    public static String convertSeconds(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        String time = "";
        if (hours > 0) {
            time += hours + ((hours == 1) ? " час, " : " часа, ");
        }
        if (minutes > 0) {
            time += minutes + ((minutes == 1) ? " минуту" : " минут") + " и ";
        }
        time += remainingSeconds + ((remainingSeconds == 1) ? " секунду" : " секунд");

        return time;
    }
}