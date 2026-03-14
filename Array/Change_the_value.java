package Array;

import java.util.Arrays;

public class Change_the_value {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(change(arr)));
        
    }

    static int[] change (int[] arr){

        arr[1]=22;
        return arr;

    }
    
}
