package designPatterns;

// Product interface
interface MyCoffee {
    void brew();
}

// Concrete products
class Latte implements MyCoffee {
    public void brew() {
        System.out.println("Brewing a Latte...");
    }
}

class Cappuccino implements MyCoffee {
    public void brew() {
        System.out.println("Brewing a Cappuccino...");
    }
}

// Factory class
class CoffeeFactory {
    public static MyCoffee getCoffee(String type) {
        if (type.equalsIgnoreCase("latte")) {
            return new Latte();
        } else if (type.equalsIgnoreCase("cappuccino")) {
            return new Cappuccino();
        }
        throw new IllegalArgumentException("Unknown coffee type");
    }
}

// Client code
public class FactoryPattern {
    public static void main(String[] args) {
        MyCoffee coffee1 = CoffeeFactory.getCoffee("latte");
        coffee1.brew();

        MyCoffee coffee2 = CoffeeFactory.getCoffee("cappuccino");
        coffee2.brew();
    }
}
