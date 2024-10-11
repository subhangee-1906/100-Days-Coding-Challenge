package Day3;
import java.util.*;

public class Solution_1 {

    public static int[] rotateLeft(int d, int[] arr) {
        int n = arr.length;
        
        d = d % n;
        
        int[] rotatedArray = new int[n];
        
        for (int i = 0; i < n - d; i++) {
            rotatedArray[i] = arr[i + d];
        }
        
        for (int i = 0; i < d; i++) {
            rotatedArray[n - d + i] = arr[i];
        }
        
        return rotatedArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] rotatedArray = rotateLeft(d, arr);
        
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
