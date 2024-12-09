package Day51;

class Solution_ {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for (int num : nums) {
            candidate = (count == 0) ? num : candidate;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
