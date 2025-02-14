package Day79;
// } Driver Code Ends
class Solution {
    static ArrayList<Integer> leaders(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList <> ();
        int n = arr.length;
        
        for (int i = 0; i< n; i++) {
            int j;
            
            for (j=i+1; j < n ; j++){
                
                if(arr[i] < arr[j])
                break;
            }
            if (j==n)
            result.add(arr[i]);
        }
        return result;
    }
}

