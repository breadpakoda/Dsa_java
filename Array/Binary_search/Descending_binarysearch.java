package Array.Binary_search;

public class Descending_binarysearch {

    public static void main(String[] args) {

        int[] arr={9,8,7,6,5,4,3,2,1};
        System.out.println(desc_b_s(arr,93));        
    }

    static int desc_b_s(int[] arr, int target){

        int beg=0;
        int end=arr.length-1;

        while(end>=beg){
            int mid= beg+(end-beg)/2;
            if(target<arr[mid]){
                beg=mid+1;

            }
            else if(target>arr[mid]){
                end= mid-1;
            }
            else{
                return mid;
            }
        }


        return -1;
    }
    
}
