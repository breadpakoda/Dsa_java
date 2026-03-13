package Functions_methodes;

import java.util.Arrays;

public class Pass_by_reference_simulation {
    
    public static void main(String[] args) {
        int[]  arr={1,34,23,23,234,23646,6};


        change(arr);

        System.out.println(Arrays.toString(arr));

        


    }

    static void change(int [] nums){

        nums[0]=12;

    }
}
