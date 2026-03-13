package Functions_methodes;

import java.util.Scanner;

public class Sum_return {
    public static void main(String[] args) {

        System.out.println(sum_2());
        
    }
    

    static int  sum_2 (){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= sc.nextInt();
        System.out.print("Enter the second number: ");
        int b= sc.nextInt();
        
        int sum= a+b;

        return sum;
    }
}
