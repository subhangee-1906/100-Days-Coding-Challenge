package Day59;

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

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        Set<Integer> weights = new HashSet<>();
        List<String> results = new ArrayList<>();
        
        int currentWeight = 0;
        char prevChar = '\0';
        
        for (char c : s.toCharArray()) 
        {
            int weight = c - 'a' + 1; 
            
            if (c == prevChar) 
            {
                currentWeight += weight; 
            } else 
            {
                currentWeight = weight; 
            }
            
            weights.add(currentWeight);
            prevChar = c; 
        }     
        for (int query : queries) {
            results.add(weights.contains(query) ? "Yes" : "No");
        }
        
        return results;
    }
}

public class Solution_ {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<String> result = Result.weightedUniformStrings(s, queries);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

