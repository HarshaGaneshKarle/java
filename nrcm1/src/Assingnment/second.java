package Assingnment;
interface BasicPayment {
    void Payment();
}
interface AdvancedPayment extends BasicPayment {
    void Refund();
}
class CreditCardPayment implements AdvancedPayment {
    public void Payment() {
        System.out.println("Verifying credit card payment");
    }
    public void Refund() {
        System.out.println("Processing credit card refund");
    }
}
class PayPalPayment implements AdvancedPayment {
    public void Payment() {
        System.out.println("Verifying PayPal payment");
    }
    public void Refund() {
        System.out.println("Processing PayPal refund");
    }
}
public class second {
    public static void main(String[] args) {
        CreditCardPayment cc=new CreditCardPayment();
        PayPalPayment pp=new PayPalPayment();
        cc.Payment();
        cc.Refund();
        pp.Payment();
        pp.Refund();
    }
}
