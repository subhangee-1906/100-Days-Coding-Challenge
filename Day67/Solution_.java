package Day67;

import java.util.HashSet;

class Solution_ {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) 
        {
            uniqueCandies.add(candy);
        }
        return Math.min(uniqueCandies.size(), candyType.length / 2);
    }
}

