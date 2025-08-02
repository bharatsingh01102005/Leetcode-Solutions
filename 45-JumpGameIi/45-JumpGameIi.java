// Last updated: 8/2/2025, 10:47:05 PM
class Solution {
    public int jump(int[] nums) {
    int jumps = 0, currentEnd = 0, furthest = 0, n = nums.length;
    
    for (int i = 0; i < n - 1; i++) {
        furthest = Math.max(furthest, i + nums[i]);
        if (i == currentEnd) {
            jumps++;
            currentEnd = furthest;
        }
    }
    return jumps;    
    }
}