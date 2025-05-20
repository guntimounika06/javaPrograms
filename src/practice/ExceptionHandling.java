package practice;

import javax.naming.InsufficientResourcesException;
class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}

public class ExceptionHandling {
    int balance = 5000;

    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("InSufficient balance! Cannot withdraw" + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawl successful! Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        ExceptionHandling account = new ExceptionHandling();

        try {
            System.out.println("Attempting to withdraw Rs. 6000...");
            account.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our banking services!");
        }

        try {
            System.out.println("Attempting to withdraw Rs. 3000...");
            account.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}

