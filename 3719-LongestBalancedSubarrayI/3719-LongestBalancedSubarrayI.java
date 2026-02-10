// Last updated: 10/02/2026, 20:27:10
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int res = 0;
4        HashSet<Integer> odd = new HashSet<>(), even = new HashSet<>();
5        for (int i = 0; i < nums.length; i++){
6            odd.clear(); 
7            even.clear();
8            for (int j = i; j < nums.length; j++){
9                int num = nums[j];
10                if ((num & 1) == 1) odd.add(num);
11                else even.add(num);
12                if (odd.size() == even.size()){
13                    res = Math.max(res, j - i + 1);
14                }
15            }
16        }
17        return res;
18    }
19}