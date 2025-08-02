// Last updated: 8/2/2025, 10:43:33 PM
class Solution {
    public int countSubarrays(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] + nums[i + 2]) * 2 == nums[i + 1]) {
                res++;
            }
        }
        return res;
    }
}