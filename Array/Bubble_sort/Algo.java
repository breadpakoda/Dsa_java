package Array.Bubble_sort;

import java.util.Arrays;

public class Algo {
    
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(bubble_sort(arr)));
        
    }


    static int[] bubble_sort(int[] arr){
        
        boolean swapped;
        for(int i=0; i<arr.length-1; i++){
            swapped=false;
            for(int j=1; j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                    
                }
            }
            if( !swapped ){
                break;
            }
        }


        return arr;
    }
}
