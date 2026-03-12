import java.util.Scanner;

public class Count_occurance {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int num=2312335;
        int check_num=sc.nextInt();
        int count=0;
       for(int i=(int)Math.log10(num)+1; i>0;i--){

        if(num%10==check_num){
            count++;
            
        }
        num=num/10;



       }

       System.out.println(count);
       sc.close();
    }
    
}
