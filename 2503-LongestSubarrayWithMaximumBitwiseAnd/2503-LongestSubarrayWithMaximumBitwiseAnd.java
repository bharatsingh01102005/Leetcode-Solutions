// Last updated: 8/2/2025, 10:44:34 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxVal) maxVal = num;
        }
        int streak = 0, maxStreak = 0;
        for (int num : nums) {
            if (num == maxVal) {
                streak++;
                if (streak > maxStreak) maxStreak = streak;
            } else {
                streak = 0;
            }
        }
        return maxStreak;
    }
}