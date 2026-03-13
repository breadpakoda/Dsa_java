package Functions_methodes;

public class Scope {

    public static void main(String[] args) {
        int a=10;

        {
            int b=12;
            System.out.println(b);
            a=101;
        }
        a=1;

        int b=122;

        System.out.println(b);
        System.out.println(a);
    }
    
}
