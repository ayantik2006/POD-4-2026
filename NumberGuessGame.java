import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int randomNum=random.nextInt(1, 101);
        System.out.println("Enter a number between 1 and 100 including 1 and 100" );
        int num=sc.nextInt();
        while(num!=randomNum){
            if(num>randomNum){
                System.out.println("Too High! Try Again: ");
                num=sc.nextInt();
            }
            else if(num<randomNum){
                System.out.println("Too Less! Try Again: ");
                num=sc.nextInt();
            }
        }
        System.out.println("Correct Guess!");
    }
}
