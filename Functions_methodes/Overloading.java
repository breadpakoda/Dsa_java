package Functions_methodes;

public class Overloading {

    public static void main(String[] args) {

        sample(1);
        sample("aditya");
        
    }

    static void sample(int a){
        System.out.println(a);
    }
    static void sample(String a){
        System.out.println(a);

    }
    
}
