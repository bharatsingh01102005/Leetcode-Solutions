// Last updated: 10/09/2026, 11:14:09
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n = nums.length;
4        int prefix = 1;
5        int suffix=1;
6        int ans = Integer.MIN_VALUE;
7
8        for(int i = 0; i<n; i++){
9            if(prefix==0)
10               prefix=1;
11            if(suffix==0)
12               suffix=1;
13
14            prefix=prefix*nums[i];
15            suffix = suffix*nums[n-1-i];
16            ans=Math.max(ans,Math.max(prefix,suffix));      
17        }
18        return ans;
19        
20    }
21}