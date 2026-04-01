import java.util.Arrays;

class Alog {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(Arrays.toString(find(arr, 5)));

    }

    static int[] find(int[][] arr, int target) {

        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col > 0) {
            if (arr[row][col] == target) {
                
                return new int[] { row, col };
            } else if (target > arr[row][col]) {
                row++;
            }

            else {
                col--;
            }
        }
        return new int[] { -1, -1 };

    }
}