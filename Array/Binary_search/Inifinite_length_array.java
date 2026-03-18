package Array.Binary_search;

public class Inifinite_length_array {
    public static void main(String[] args) {
        int[] arr = new int[10000];

        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }

        System.out.println(pass_indexes(arr, 34));

    }

    static int find(int[] arr, int target, int beg, int end) {

        while (end >= beg) {
            int mid = beg + (end - beg) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                beg = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;

    }

    static int pass_indexes(int arr[], int target) {
        int n=0;
       int beg=(int)Math.pow(2,n);
       int end=(int)Math.pow(2,n+1);
      


       while(arr[end]>target){
        
        
       }
       
       
        return -1;
    }

}
