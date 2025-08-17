package designPatterns;

// Strategy interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete strategies
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

// Context
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

// Usage
public class StrategyPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();


        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);  // Paid 500 using Credit Card

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(300);  // Paid 300 using PayPal

     }
}
