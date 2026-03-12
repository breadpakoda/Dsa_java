public class Fibonachi {

    public static void main(String[] args) {
        int first=0 ;
        int second= 1;



        // for (int i=0 ; i<= 7 ; i++){
        //     System.out.println(first);
        //     int temp= first;
        //     first= second;
        //     second= temp+second;

            
        // }
        int i=0;

        while (i<=7){
        System.out.println(first);
        int temp= first;
        first= second;
        second+=temp;
        i++;
    }}
    
}
