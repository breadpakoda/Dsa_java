package Array.Linear_search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,5,235,235,235,2354,325};
        int item= 13;


       if(arr==null || arr.length==0){
        System.out.println("Under flow");
       }

        for(int i : arr){
            if(i==item ){
                System.out.println("Found at "+i);
                return;
            }
            
        }
        
                System.out.println("Item not in the list");
            

        
    }
    
}
