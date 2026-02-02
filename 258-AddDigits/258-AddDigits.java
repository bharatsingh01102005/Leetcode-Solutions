// Last updated: 02/02/2026, 23:18:47
1class Solution {
2    public int addDigits(int num) {
3        if (num == 0)
4            return 0;
5        if (num % 9 == 0)
6            return 9;
7        return num % 9;
8    }
9}