package Array;

import java.util.ArrayList;

public class Array_list_of_Arrylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>(3);

       ArrayList<Integer> inner= new ArrayList<>();
       ArrayList<Integer> inner2= new ArrayList<>();

       inner.add(10);
       inner.add(10);
       inner2.add(10);
       inner2.add(20);
       
       list.add(inner);
       list.add(inner2);

       System.out.println(list);
    }
    
}
