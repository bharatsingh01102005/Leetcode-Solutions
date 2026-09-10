// Last updated: 10/09/2026, 10:32:27
1import java.util.*;
2class Solution {
3    public int longestConsecutive(int[] arr) {
4        HashSet<Integer> set = new HashSet<>();
5
6        for(int num:arr){
7            set.add(num);
8        }
9        int longest = 0;
10        for(int num:set){
11            if(!set.contains(num-1)){
12                int current = num;
13                int count = 1;
14
15                while(set.contains(current+1)){
16                    current++;
17                    count++;
18                }
19                longest = Math.max(longest,count);
20            }
21        }
22        return longest;
23       
24    }
25}