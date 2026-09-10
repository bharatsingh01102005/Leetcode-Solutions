// Last updated: 10/09/2026, 11:32:19
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n=nums.length;
4        int [] ans = new int[n];
5        int left = 1;
6
7        for(int i = 0; i<n; i++){
8            ans[i] = left;
9            left = left*nums[i];
10        }
11        int right = 1;
12        for(int i = n-1; i>=0; i--){
13            ans[i] = ans[i]*right;
14            right = right*nums[i];
15        }
16        return ans;
17    }
18}