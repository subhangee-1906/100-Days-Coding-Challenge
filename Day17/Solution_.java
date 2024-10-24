package Day17;

import java.io.*;
import java.util.stream.*;


class Result {

    /*
     * Complete the 'substringDiff' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. STRING s1
     *  3. STRING s2
     */
    public static int substringDiff(int k, String s1, String s2) {
        int maxLength = 0;
        int len1 = s1.length();
        int len2 = s2.length();

        for (int i = 0; i < len1; i++) {
            maxLength = Math.max(maxLength, getMaxLenWithKDiff(k, s1, s2, i, 0));
        }
        for (int j = 0; j < len2; j++) {
            maxLength = Math.max(maxLength, getMaxLenWithKDiff(k, s1, s2, 0, j));
        }

        return maxLength;
    }

    private static int getMaxLenWithKDiff(int k, String s1, String s2, int start1, int start2) {
        int maxLen = 0;
        int len1 = s1.length();
        int len2 = s2.length();
        int diffCount = 0;
        int left = 0;

        for (int right = 0; (start1 + right) < len1 && (start2 + right) < len2; right++) {
        
            if (s1.charAt(start1 + right) != s2.charAt(start2 + right)) {
                diffCount++;
            }

            
            while (diffCount > k) {
                if (s1.charAt(start1 + left) != s2.charAt(start2 + left)) {
                    diffCount--;
                }
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

public class Solution_ {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int k = Integer.parseInt(firstMultipleInput[0]);

                String s1 = firstMultipleInput[1];

                String s2 = firstMultipleInput[2];

                int result = Result.substringDiff(k, s1, s2);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
