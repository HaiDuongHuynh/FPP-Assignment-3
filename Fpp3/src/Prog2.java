public class Prog2 {
    private static int x;
    public Prog2(){
        System.out.println("Default Constructor!");
    }

    public Prog2(int a){
        System.out.println("Parameter Constructor with integer: " + a);
    }



    {
        System.out.println("instance field 1");
    }

    {
        System.out.println("instance field 2");
    }

    static {
        System.out.println("static field 1");
    }

    static {
        System.out.println("static field 2");
    }
    public static void staticMethod1(){
        System.out.println("static method 1");
    }
    public static void staticMethod2(){
        System.out.println("static method 2");
    }

    public void instanceMethod1(){
        System.out.println("instance method 1");
    }

    public void instanceMethod2(){
        System.out.println("instance method 2");
    }
}
