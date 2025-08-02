// Last updated: 8/2/2025, 10:45:15 PM
class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;

        for (int n : nums) {
            if ((n > 9 && n < 100) || (n > 999 && n < 10000) || n == 100000) {
                res++;
            }
        }

        return res;        
    }
}