class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // 1. Starting spaces remove
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Sign check
        int sign = 1;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // 3. Number banana
        int ans = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // Overflow check
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            ans = ans * 10 + digit;
            i++;
        }

        return ans * sign;
    }
}
