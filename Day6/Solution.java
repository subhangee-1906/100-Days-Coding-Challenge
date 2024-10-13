

public class Solution {
    public static int romanToInt(String s) {
        int total = 0, prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = "IVXLCDM".indexOf(s.charAt(i)) % 7;
            curr = (int) (Math.pow(10, curr / 2) * (curr % 2 == 0 ? 1 : 5));
            total += curr < prev ? -curr : curr;
            prev = curr;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));     
        System.out.println(romanToInt("IV"));      
        System.out.println(romanToInt("IX"));      
        System.out.println(romanToInt("LVIII"));   
        System.out.println(romanToInt("MCMXCIV")); 
    }
}
