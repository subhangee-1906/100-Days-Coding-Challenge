package Day69;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) i++;
            result.add(start == nums[i] ? String.valueOf(start) : start + "->" + nums[i]);
        }
        return result;
    }
}

