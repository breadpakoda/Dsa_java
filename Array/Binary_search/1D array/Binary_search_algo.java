package Array.Binary_search;

import java.util.Scanner;

public class Binary_search_algo {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};

        Scanner sc= new Scanner(System.in);
        System.out.println(b_s(arr,sc.nextInt()));
        
    }

    static int b_s(int[] arr,int target){
        int beg=0;
        int end= arr.length-1;
        while(beg<=end){
            int mid= beg+(end-beg)/2;
            if(target>arr[mid]){
                beg= mid+1;
            
            }
            else if(target<arr[mid]){
                end=mid-1;
                

            }
            else{
                return mid;
            }
        }

            return -1;
    }
}
