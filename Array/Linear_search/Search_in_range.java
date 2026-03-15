package Array.Linear_search;

public class Search_in_range {
    public static void main(String[] args) {
        int[] arr={1,24,35,235,135,23,523,5};

        int response=search(arr,1,4,23);

        if(response==-2){
            System.out.println("Under flow");
        }

        else{
            if(response==-1){
                System.out.println("Item not in the list");
            }
            else{
                System.out.println("Item found at "+ response);
            }
        }
    }

    static int search(int[] arr, int beg, int end,int item){

        if(arr.length==0){
            return -2;
        }

        for(int i=beg ; i<=end ;i++){

            if(arr[i]==item){
                return i;
            }

            

        }

        return -1;
    }
    
}
