
import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        double p, r, amount;
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amt: ");
        p = sc.nextDouble();
        System.out.println("Enter interest rate(in %): ");
        r = sc.nextDouble();
        System.out.println("Enter the number of times compounded per year: ");
        n = sc.nextInt();
        System.out.println("Enter number of years: ");
        t = sc.nextInt();

        amount = p * Math.pow(1 + (r / (n * 100)), n * t);
        System.out.printf("Amount: Rs. %.2f", amount);

        sc.close();
    }
}
