import static java.lang.System.exit;

public class Prog1 {
    private static int count = 0;

    public Prog1(){

    }

    public static Prog1 getInstance(){
        if(count == 3) {
            System.out.println("Only 3 instances allowed!!!");
            exit(0);
        }
        //System.out.println("Allow.");
        count++;
        return new Prog1();
    }

    public static void main(String[] args) {
        int numberOfInstances = 4;
        Prog1 a = new Prog1();
        for(int i=0;i<numberOfInstances;i++){
            a.getInstance();
        }
        System.out.println("Success!");
    }
}
