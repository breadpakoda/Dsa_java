package Functions_methodes;

import java.util.Arrays;

public class Variable_arguments {

    public static void main(String[] args) {

        var_args(1,2,2,34,5,6,3,54,32,1,234,56,54);
        var_args_2(1,2,"aditya","naman","aman");

        
    }

    static void  var_args(int ...args){
        System.out.println(Arrays.toString(args));
    }

    static void var_args_2(int a , int b , String ...c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));

    }
    
}
