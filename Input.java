import java.util.Scanner;

class Input{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the statement: ");
        String statement= sc.next();
        System.out.println("Enter the second statement");
        String statement2= sc.nextLine();
        System.out.println(statement);
        System.out.println(statement2);
    }
}