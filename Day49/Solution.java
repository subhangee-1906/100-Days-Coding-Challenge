package Day49;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.*;

class Result {

    /*
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) 
        {
            uniqueChars.add(c);
        }

        List<Character> charList = new ArrayList<>(uniqueChars);

        int maxLength = 0;

        for (int i = 0; i < charList.size(); i++) 
        {
            for (int j = i + 1; j < charList.size(); j++) 
            {
                char a = charList.get(i);
                char b = charList.get(j);

                StringBuilder filtered = new StringBuilder();
                for (char c : s.toCharArray()) 
                {
                    if (c == a || c == b) 
                    {
                        filtered.append(c);
                    }
                }

                if (isAlternating(filtered.toString())) 
                {
                    maxLength = Math.max(maxLength, filtered.length());
                }
            }
        }

        return maxLength;
    }

    private static boolean isAlternating(String str) 
    {
        for (int i = 1; i < str.length(); i++) 
        {
            if (str.charAt(i) == str.charAt(i - 1)) 
            {
                return false; 
            }
        }
        return true;
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

