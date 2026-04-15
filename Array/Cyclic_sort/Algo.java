package Array.Cyclic_sort;

import java.util.Arrays;

public class Algo {

    public static void main(String[] args) {

        int[] arr={5,2,3,4,1};

        System.out.println(Arrays.toString(cyclic_sort(arr)));
        
    }


    static int[] cyclic_sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                //swap
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
            
        }


      return arr;
}
    
}


