// Last updated: 8/2/2025, 10:43:54 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (num < k) return -1;
            if (num > k) seen.add(num);
        }
        return seen.size();
    }
}