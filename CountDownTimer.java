
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {
    public static void main(String[] args) {
        Timer timer=new Timer();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the timer start: ");
        int start=sc.nextInt();
        TimerTask timertask=new TimerTask() {
            int n=start;
            @Override
            public void run(){
                System.out.println(n);
                n--;
                if(n<=0){
                    System.out.println("Happy new year!!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(timertask, 0,1000);
    }
}
