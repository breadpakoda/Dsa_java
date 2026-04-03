package Array.Insertion_sort;
import java.util.Arrays;

class Algo{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(insertion_sort(arr)));
        
    }

    static int[]  insertion_sort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }

        }

        return arr;

    }
}
