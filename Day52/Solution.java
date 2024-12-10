class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            int lCount = i + 1; 
            int rCount = n - i; 
            int oddSubarrayCount = ((lCount * rCount) + 1) / 2;
            totalSum += arr[i] * oddSubarrayCount;
        }
        
        return totalSum;
    }
}
