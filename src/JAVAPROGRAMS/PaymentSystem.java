package JAVAPROGRAMS;
abstract class Payment
{
    abstract void pay(double amount);

    void transactionSuccess()
    {
        System.out.println("Transaction Successfull");
    }
}

class CreditCard extends Payment
{
    void pay(double amount)
    {
        System.out.println("Paid" + amount + "using credit card");
    }
}


class UPI extends Payment
{
    void pay(double amount)
    {
        System.out.println("Paid" + amount + "using UPI");
    }
}

public class PaymentSystem {

    public static void main(String[] args)
    {
        Payment payment;
        payment = new CreditCard();
        payment.pay(1000);
        payment.transactionSuccess();

        payment = new UPI();
        payment.pay(500);
        payment.transactionSuccess();// TODO Auto-generated method stub

    }

}
