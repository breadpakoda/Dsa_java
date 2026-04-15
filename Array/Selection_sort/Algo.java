package Array.Selection_sort;

import java.util.Arrays;

public class Algo {

    public static void main(String[] args) {
        int[] arr={4,6,3,7,2,9,2,9,23,87,345,576};
        System.out.println(Arrays.toString(selection_sort(arr)));
        
    }
    

    static int[] selection_sort(int[] arr){

        for(int i=0 ; i<arr.length-1;i++){
            int max=0;
            int last=arr.length-i-1;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }


                int temp=arr[max];
                arr[max]=arr[last];
                arr[last]=temp;

            }
        }
        

        return arr;

    }
}
