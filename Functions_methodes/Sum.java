package Functions_methodes;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        add();
       

    }

    static void add(){

         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a= sc.nextInt();
        System.out.print("Enter the second number: ");
        int b= sc.nextInt();
        
        int sum= a+b;

        System.out.println(sum);

    }
    
}
