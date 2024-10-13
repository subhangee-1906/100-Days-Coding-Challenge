package Day4;
import java.util.*;
public class DynamicArray {
    public static List<Integer> dynamicArray(int n, List<String> queries) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        } 
        int lastAnswer = 0;
        List<Integer> results = new ArrayList<>();
        for (String query : queries) {
            String[] parts = query.split(" ");
            int type = Integer.parseInt(parts[0]);
            int x = Integer.parseInt(parts[1]);
            int y = Integer.parseInt(parts[2]);
            int idx = (x ^ lastAnswer) % n;
            if (type == 1) {
                arr.get(idx).add(y);
            }
            else if (type == 2) {
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                results.add(lastAnswer);
            }
        }
        
        return results;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int q = scanner.nextInt();  
        scanner.nextLine();  
        
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(scanner.nextLine());
        }
        
       
        List<Integer> result = dynamicArray(n, queries);
        
        
        for (int res : result) {
            System.out.println(res);
        }
        
        scanner.close();
    }
}
