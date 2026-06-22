import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Main {
    static void withdraw(double balance, double amount)
        throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Funds");
        }
        balance = balance - amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();
        try {
            withdraw(balance, amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
