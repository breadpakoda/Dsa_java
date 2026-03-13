package Functions_methodes;

import java.util.Scanner;

public class Armstrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num= sc.nextInt();

        System.out.println(is_armstrom(num));

        // for(int i=0 ; i<10000; i++){
        //     if(is_armstrom(i)){
        //         System.out.println(i);
        //     }
        // }

    }

    static boolean is_armstrom(int num){

        int temp= num;
        int result=0;
        while(temp!=0){
            result+=Math.pow((temp%10),3);
            temp= temp/10;
        }
        

        return num==result;

    }
    
}
