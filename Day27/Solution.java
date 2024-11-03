package Day27;

import java.io.*;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    k = k % 26;
    StringBuilder result = new StringBuilder();
     for (char c : s.toCharArray()) 
     {
        
        if (Character.isUpperCase(c)) 
        {
            
            char shifted = (char) (((c - 'A' + k) % 26) + 'A');
            result.append(shifted);
        }
        
        else if (Character.isLowerCase(c)) {
            
            char shifted = (char) (((c - 'a' + k) % 26) + 'a');
            result.append(shifted);
        }
        
        else {
            result.append(c);
        }
      }

    
    return result.toString();
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

