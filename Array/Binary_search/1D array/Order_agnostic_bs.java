package Array.Binary_search;

public class Order_agnostic_bs {

    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] arr2={9,8,7,6,5,4,3,2,1};

        System.out.println(search(arr2,3));

    }

    static int search(int[] arr, int target) {
        int beg = 0;
        int end = arr.length - 1;

        if (arr[0] < arr[arr.length - 1]) {

            while (beg <= end) {
                int mid = beg + (end - beg) / 2;
                if (target > arr[mid]) {
                    beg = mid + 1;

                } else if (target < arr[mid]) {
                    end = mid - 1;

                } else {
                    return mid;
                }
            }
            return -1;

        }

        else if ((arr[0] > arr[arr.length - 1])) {
            while (end >= beg) {
                int mid = beg + (end - beg) / 2;
                if (target < arr[mid]) {
                    beg = mid + 1;

                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }

            return -1;

        }
        else{
            return -2;
        }

    }

}
