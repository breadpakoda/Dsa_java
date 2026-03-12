public class Reverse_number {

    public static void main(String[] args) {
        int num=12345;

        int reverse_number=0;
        // String reverse_string= new String();
        // for(int i= (int)Math.log10(num);i>=0 ; i--) {

        //     reverse_string=reverse_string+Integer.toString(num%10);
        //     num= num/10;

            
           

        //    }

           
        //    reverse_number=Integer.parseInt(reverse_string);

        //    System.out.println(reverse_number);


        while(num>0){
            reverse_number=(reverse_number*10)+num%10;
            num/=10;

        }
        System.out.println(reverse_number);
        }
    
}
