package Array.Linear_search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,2};
        int item= 13;

        for(int i : arr){
            if(i==item ){
                System.out.println("Found at "+i);
                return;
            }
            
        }
        
                System.out.println("Item not in the list");
            

        
    }
    
}
