import java.util.Scanner;

class Conditional{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int number= sc.nextInt();
        if(number==100){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
    }
}