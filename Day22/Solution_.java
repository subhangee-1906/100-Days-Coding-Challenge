package Day22;

import java.io.*;

class Result {
    public static String timeConversion(String s) {
        
        String period = s.substring(s.length() - 2); 
        int hour = Integer.parseInt(s.substring(0, 2));
        
        String minute = s.substring(3, 5);
        String second = s.substring(6, 8);
        
           if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0; 
            }
        } 
        else 
        {
            if (hour != 12) 
            {
                hour += 12; 
            }
        }  
        return String.format("%02d:%s:%s", hour, minute, second);
    }
}


public class Solution_ {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

