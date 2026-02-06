// Last updated: 06/02/2026, 23:55:21
1class Solution {
2    public int minRemoval(int[] nums, int k) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        int ans = 0;
6        for(int i = 0, j = 0; i < n; i ++){
7            while(j + 1 < n && (long) nums[i] * (long) k >= nums[j + 1]){
8                j ++;
9            }
10            ans = Math.max(ans, j - i + 1);
11        }
12        return n - ans;
13    }
14}