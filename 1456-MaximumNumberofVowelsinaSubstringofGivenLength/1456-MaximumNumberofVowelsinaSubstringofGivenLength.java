// Last updated: 25/06/2026, 13:35:36
1class Solution {
2    public int maxVowels(String s, int k) {
3        int max = 0;
4        int count = 0;
5        for(int i = 0; i<k; i++){
6            if(isVowel(s.charAt(i))){
7                count++;
8            }
9        }
10        max=count;
11
12        for(int i = k; i<s.length(); i++){
13            if(isVowel(s.charAt(i))){
14                count++;
15
16            }
17            if(isVowel(s.charAt(i-k))){
18                count--;
19            }
20            max=Math.max(max,count);
21
22
23        }
24
25        return max;
26    }
27    public boolean isVowel(char c) {
28        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
29
30    }
31
32}