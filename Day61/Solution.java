package Day61;

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

class Result {

    /*
     * Complete the 'separateNumbers' function below.
     *
     * The function accepts STRING s as parameter.
     */

   public static void separateNumbers(String s) {
        if (s.length() < 2) 
        {
            System.out.println("NO");
            return;
        }
        
        for (int len = 1; len <= s.length() / 2; len++) 
        {
            String first = s.substring(0, len);
            long num = Long.parseLong(first);
            StringBuilder sequence = new StringBuilder(first);
            
            while (sequence.length() < s.length()) 
            {
                num++;
                sequence.append(num);
            }
            
            if (sequence.toString().equals(s)) 
            {
                System.out.println("YES " + first);
                return;
            }
        }
        
        System.out.println("NO");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                Result.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

