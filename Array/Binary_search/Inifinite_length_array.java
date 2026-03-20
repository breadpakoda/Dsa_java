package Array.Binary_search;

public class Inifinite_length_array {
    public static void main(String[] args) {
        int[] arr = new int[10000];

        for (int i = 0; i < 10000; i++) {
            arr[i] = i + 1;
        }

        System.out.println(pass_indexes(arr, 000));

    }

    static int find(int[] arr, int target, int beg, int end) {

        // binary search
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
        
        int beg = 0;
        int end = 1;

        while (target>arr[end]) {
            beg= end+1;
            end*=2;
        }
        return find(arr,target,beg,end);

    }

}
