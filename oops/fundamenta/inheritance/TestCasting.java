package oops.fundamenta.inheritance;

public class TestCasting {
    public static void main(String[] args) {

        // Normal object creation
        WhiteTiger wt = new WhiteTiger(null);
        wt.whitecolor();
        wt.roar();
        wt.walk();

        System.out.println("-----------");

        // Upcasting
        Tiger tiger = wt;   // WhiteTiger -> Tiger
        tiger.roar();
        tiger.walk();
        // tiger.whiteColor();  // ❌ CTE
//        ((WhiteTiger)Tiger).whitecolor();
//        System.out.println("-----------");
//
        Animal animal = tiger;  // Tiger -> Animal
        animal.walk();
        // animal.roar();       // ❌ CTE
        // animal.whiteColor(); // ❌ CTE

        System.out.println("-----------");

        // Downcasting (valid)
        Animal a = new WhiteTiger(null);
        WhiteTiger obj = (WhiteTiger) a;
        obj.walk();
        obj.roar();
        obj.whitecolor();

        System.out.println("-----------");

        // Downcasting (invalid – runtime error)
        Animal a1 = new Animal(null);
        // WhiteTiger wt2 = (WhiteTiger) a1; // ❌ ClassCastException
    }
}