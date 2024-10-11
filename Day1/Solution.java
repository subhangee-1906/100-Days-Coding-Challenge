package Day1;
import java.util.Scanner;

public class Solution {

    
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversedArr = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - i - 1];
        }
        
        return reversedArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

       
        int[] result = reverseArray(arr);

        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}
