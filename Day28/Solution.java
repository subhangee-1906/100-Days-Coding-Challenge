class Solution {
    public int divide(int dividend, int divisor) 
    {
        if (dividend == Integer.MIN_VALUE && divisor == -1) 
        {
            return Integer.MAX_VALUE;
        }

        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long dividendLong = Math.abs((long) dividend);
        long divisorLong = Math.abs((long) divisor);

        int result = 0;

        while (dividendLong >= divisorLong) 
        {
            long tempDivisor = divisorLong;
            int multiple = 1;
            while (dividendLong >= (tempDivisor << 1)) 
            {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            dividendLong -= tempDivisor;
            result += multiple;
        }

        return isNegative ? -result : result;
    }
}

