// Last updated: 31/01/2026, 21:02:54
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int left = 0;
4        int right = letters.length - 1;
5        char answer = letters[0];
6
7        while (left <= right) {
8            int mid = left + (right - left) / 2;
9
10            if (letters[mid] > target) {
11                answer = letters[mid];
12                right = mid - 1;
13            } else {
14                left = mid + 1;
15            }
16        }
17
18        return answer;
19    }
20}