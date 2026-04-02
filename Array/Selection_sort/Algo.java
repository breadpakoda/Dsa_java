package Array.Selection_sort;

import java.util.Arrays;

public class Algo{
    public static void main(String[] args) {
        int[] arr={2,23,235,2355,2,1,637,43,21,152,1};
        System.out.println(Arrays.toString(selection_sort(arr)));
        
    }

    static int[] selection_sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int maxat=0;
            for(int j=0; j<arr.length-i;j++){
                if(arr[j]>arr[maxat]){
                    maxat=j;
                }
            }
            int temp= arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[maxat];
            arr[maxat]=temp;
            
        }
        
        
        
        return arr;
    }
}
