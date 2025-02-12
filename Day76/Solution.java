class Solution {
    public int search(int[] n, int target) {
        int l = 0, r = n.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2; 
            
            if (n[mid] == target) {
                return mid; 
            } else if (n[mid] < target) {
                l = mid + 1; 
            } else {
                r = mid - 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = sol.search(arr, target);
        System.out.println(result != -1 ? "Element found at index: " + result : "Element not found.");
    }
}
