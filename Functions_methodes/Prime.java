package Functions_methodes;

public class Prime {
    public static void main(String[] args) {

        System.out.println(is_prime(4));

    }

    static boolean is_prime(int num) {

        boolean result;
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;

            } else {
                return true;
            }

        }
        return true;

    }

}
