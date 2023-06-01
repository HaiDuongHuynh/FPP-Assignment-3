
public class Main {
    public static void main(String[] args) {
        Prog2 a = new Prog2();
        Prog2 b = new Prog2(200);
        a.instanceMethod1();
        a.instanceMethod2();
        b.instanceMethod1();
        b.instanceMethod2();
        a.staticMethod1();
        a.staticMethod2();
        b.staticMethod1();
        b.staticMethod2();
    }
}