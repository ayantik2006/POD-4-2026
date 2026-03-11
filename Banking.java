
import java.util.Scanner;

class Account {

    private double balance = 0;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    int getOptions() {
        System.out.println("Choose Options: ");
        System.out.println("1) Check Balance");
        System.out.println("2) Deposit Money");
        System.out.println("3) Withdraw Money");
        System.out.println("0) Exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 0) {
            System.out.println("Thank you!");
            System.exit(0);
            return 0;
        }
        if (option < 0 || option > 3) {
            System.out.println("Invalid option. Try again...");
            return -1;
        }
        return option;
    }

    double getBalance() {
        return balance;
    }

    void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        double amt = sc.nextDouble();
        this.balance += amt;
    }

    void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn: ");
        double amt=sc.nextDouble();
        if(amt>balance){
            System.out.println("Insufficient balance! Try again...");
            this.withdrawMoney();
        }
        balance-=amt;
        System.out.printf("Rs. %f is withdrawn!\n",amt);
    }
}

public class Banking {

    public static void main(String[] args) {
        Account acc = new Account(1000);
        int option = acc.getOptions();
        while (option == -1) {
            option = acc.getOptions();
        }
        switch (option) {
            case 1 -> {
                System.out.println("Balance: Rs." + acc.getBalance());
            }
            case 2 -> {
                acc.depositMoney();
                System.out.println("Balance: Rs." + acc.getBalance());
            }
            case 3 -> {
                acc.withdrawMoney();
                System.out.println("Balance: Rs." + acc.getBalance());
            }
        }
    }
}
