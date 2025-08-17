package basics;
//Java doesn't support multiple inheritance but allows via interfaces

interface A {
    default void show() {
        System.out.print("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements B, A {
    public void show() {
        A.super.show();  //InterfaceName.super.methodName()
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }

}
