package Array.Linear_search;

public class Character_search {

    public static void main(String[] args) {

        String name= "aditya";
        char item='i';

        if(check(name,item)==-1){
            System.out.println("Item not found in the list");
        }

        else{
            System.out.println("Item found at "+ check(name,item));
        }
        
    }

    static int check(String str , char item){

        if(str.length()==0){
            return -1;
        }

        for(int i=0; i<str.length();i++){

            if(str.charAt(i)==item){
                return i;
            }

        }


        return -1;


    }
    
}
