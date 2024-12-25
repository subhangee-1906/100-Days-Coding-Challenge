package Day66;

import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        int[][] indexedScores = new int[n][2];
        for (int i = 0; i < n; i++) 
        {
            indexedScores[i][0] = score[i];
            indexedScores[i][1] = i;
        }
        Arrays.sort(indexedScores, (a, b) -> b[0] - a[0]);
        for (int rank = 0; rank < n; rank++) 
        {
            int index = indexedScores[rank][1];
            if (rank == 0) 
            {
                result[index] = "Gold Medal";
            } 
            else if (rank == 1) 
            {
                result[index] = "Silver Medal";
            } 
            else if (rank == 2) 
            {
                result[index] = "Bronze Medal";
            } 
            else 
            {
                result[index] = String.valueOf(rank + 1);
            }
        }
        
        return result;
    }
}

