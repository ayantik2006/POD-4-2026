import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter time for alarm (hh:mm:ss): ");
        String inputTime = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime alarmTime = LocalTime.parse(inputTime, formatter);

        while(LocalTime.now().isBefore(alarmTime)){
            int hr=LocalTime.now().getHour();
            int min=LocalTime.now().getMinute();
            int s=LocalTime.now().getSecond();
            System.out.printf("\rCurrent time: %02d:%02d:%02d",hr,min,s);
            Thread.sleep(1000);
        }

        System.out.println("\nGet Up!");
    }
}
