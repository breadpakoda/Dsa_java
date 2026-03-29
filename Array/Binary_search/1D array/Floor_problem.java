package Array.Binary_search;

public class Floor_problem {

    public static void main(String[] args) {
        int[] arr={1,34,45,56,345,3424,3552342,234412412};
        System.out.println(floor(arr,56));

    }

    static int floor(int[] arr, int target) {

        int beg = 0;
        int end = arr.length-1;

        int mid=0;

        while(beg<=end){
            mid=beg+(end-beg)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                beg=mid+1;
            }

            else{
                return arr[mid];
            }

        }

        return arr[end];

    }

}
