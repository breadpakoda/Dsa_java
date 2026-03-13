package Functions_methodes;

import java.util.Scanner;

public class Pass_arguments {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println(return_sum(a,b));

        sc.close();
        
    }

    static int return_sum(int a, int b){
        return(a+b);
    }

    
}
