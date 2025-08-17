package designPatterns;

interface Coffee{
    String  getDescription();
    int cost();
}

class BasicCoffee implements Coffee{
    public String getDescription(){
        return "Basic Coffee";
    }
    public int cost(){
        return 5;
    }
}

abstract class Decorator implements Coffee{
    Coffee coffee;

    Decorator(Coffee coffee){
        this.coffee=coffee;
    }
}
class Milk extends Decorator{
    Milk(Coffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return coffee.getDescription()+"+Milk";
    }
    public int cost(){
        return coffee.cost()+5;
    }

}
class Sugar extends Decorator{
    Sugar(Coffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return coffee.getDescription()+"+Sugar";
    }
    public int cost(){
        return coffee.cost()+15;
    }

}




// Usage
public class DecoratorPattern {
    public static void main(String[] args) {

        Coffee coffee= new BasicCoffee();

        coffee=new Milk(coffee);
        coffee=new Sugar(coffee);

       System.out.print(coffee.cost());

    }
}

