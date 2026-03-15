package Array.Linear_search;

public class Min_in_array {
    public static void main(String[] args) {
        int[] arr={1000,124,124,124,124,1222,412,42,463};
        System.out.println(min(arr));
        
    }

    static int min(int[] arr){
        int min_element=arr[0];

        for(int i : arr){
            if(i<min_element){
                min_element=i;
            }
        }

        return min_element;
    }
}
