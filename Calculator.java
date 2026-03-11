
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double num1, num2, ans=0;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        num1 = sc.nextDouble();
        System.out.println("Enter num2: ");
        num2 = sc.nextDouble();
        System.out.println("Enter the operator(+,-,*,/,%): ");
        op = sc.next().charAt(0);
        switch (op) {
            case '+' ->
                ans = num1 + num2;
            case '-' ->
                ans = num1 - num2;
            case '*' ->
                ans = num1 * num2;
            case '/' ->
                ans = num1 / num2;
            case '%' ->
                ans = num1 % num2;
            default -> {
                System.out.println("Invalid operator!");
                op='x';
            }
        }
        if(op!='x'){
            System.out.println("Answer: "+ans);
        }
    }
}
