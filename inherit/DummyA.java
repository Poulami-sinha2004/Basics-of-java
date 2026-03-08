package inherit;
class DummyyA {

    static String a1 = "a1 variable";

    public static void a1() {
        System.out.println("static a1()");
    }

    static {
        System.out.println("DummyA static init");
    }

    String a2 = "a2 variable";

    public void a2() {
        System.out.println("Non static a2()");
    }

    {
        System.out.println("DummyA non static init");
    }

    public DummyyA() {
        System.out.println("DummyA const");
    }

    public static void main(String[] args) {
        System.out.println("DummyA main");
    }
}

class DummyyB extends DummyyA {

    static String b1 = "b1 var";

    public static void b1() {
        System.out.println("static b1()");
    }

    static {
        System.out.println("DummyB static init");
    }

    String b2 = "b2 var";

    public void b2() {
        System.out.println("Non static b2()");
    }

    {
        System.out.println("DummyB non static init");
    }

    public DummyyB() {
        System.out.println("DummyB const");
    }

    public static void main(String[] args) {
        DummyyB obj = new DummyyB();
        obj.b2();
        obj.a2();
    }
}