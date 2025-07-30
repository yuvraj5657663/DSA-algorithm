package Interface;


interface Payment {
    void pay(double amount);
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("paid " + amount + "via upi transection wihing successful payment");
    }
}


class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("paid " + amount + " vai credit card transection successfull");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment payment;
        payment = new UPIPayment();
        payment.pay(1500);

        payment = new CardPayment();
        payment.pay(2500);  
    }
}
