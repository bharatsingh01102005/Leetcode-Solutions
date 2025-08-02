// Last updated: 8/2/2025, 10:45:03 PM
class Solution {
    public int countHomogenous(String s) {
        int ans = 0;
        int count = 0;
        int MOD = (int) Math.pow(10,9) + 7;
        
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            
            ans = (ans + count) % MOD;
        }
        
        return ans;
    }

}



