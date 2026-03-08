package inherit;

class A {
    static int a = 100;

    static {
        System.out.println("A static block");
    }

    {
        System.out.println("A non-static block");
    }

    public A() {
        System.out.println("A constructor");
    }

    public static void a() {
        System.out.println("A static method");
    }

    public void showA() {
        System.out.println("A instance method");
    }
}

class B extends A {
    static {
        System.out.println("B static block");
    }

    {
        System.out.println("B non-static block");
    }

    public B() {
        System.out.println("B constructor");
    }

    public void showB() {
        System.out.println("B instance method");
    }
}
class C extends B {
    static {
        System.out.println("C static block");
    }

    {
        System.out.println("C non-static block");
    }

    public C() {
        System.out.println("C constructor");
    }

    public void showC() {
        System.out.println("C instance method");
    }

    public static void main(String[] args) {
        C obj = new C();

        obj.showC();
        obj.showB();
        obj.showA();

        A.a();   // correct way to call static method
    }
}
