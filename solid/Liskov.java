package solid;

public class Liskov {
    interface Bird {
        void eyes();
    }

    interface Flyable {
        void fly();
    }

    static class Sparrow implements Bird, Flyable {

        @Override
        public void eyes() {
            System.out.println("Blue Eyes");
        }
        @Override
        public void fly() {
            System.out.println("Sparrow is flying");
        }
    }

    static class Ostrich implements Bird {
        // No fly method, no violation
        @Override
        public void eyes() {
            System.out.println("Red Eyes");

        }
    }



    public static void main(String[] args) {


//      Bird(Parent) can be substituted with a child/implementation Sparrow/Ostrich
        Bird bird = new Sparrow();
        bird.eyes();

        bird = new Ostrich();
        bird.eyes();

        Flyable flyable=new Sparrow();
        flyable.fly();




    }

}

