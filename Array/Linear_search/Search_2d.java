package Array.Linear_search;

import java.util.Arrays;

public class Search_2d {

    public static void main(String[] args) {
        int[][] arr={{4,1,2,3},{3,5,6,2,56,2,5},{5,7,6,3,4,2}};

        System.out.println(Arrays.toString(search(arr, 56)));
    }

    static int[] search(int[][]arr,int item){
        int[] response= new int[2];

        if(arr.length==0){
            return new int[] {-2};

        }

        for(int i=0 ;i<arr.length; i++){
            
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==item){
                    response[0]=i;
                    response[1]=j;
                }
            }
        }

        return response;
    }
    
}
