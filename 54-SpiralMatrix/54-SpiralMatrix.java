// Last updated: 01/02/2026, 21:47:37
1class Solution {
2    public List<Integer> spiralOrder(int[][] arr) {
3
4        List<Integer> result = new ArrayList<>();
5
6        int r1 = 0, r2 = arr.length - 1;
7        int c1 = 0, c2 = arr[0].length - 1;
8
9        while (r1 <= r2 && c1 <= c2) {
10
11           
12            for (int c = c1; c <= c2; c++)
13                result.add(arr[r1][c]);
14            r1++;
15
16            
17            for (int r = r1; r <= r2; r++)
18                result.add(arr[r][c2]);
19            c2--;
20
21           
22            if (r1 <= r2) {
23                for (int c = c2; c >= c1; c--)
24                    result.add(arr[r2][c]);
25                r2--;
26            }
27
28           
29            if (c1 <= c2) {
30                for (int r = r2; r >= r1; r--)
31                    result.add(arr[r][c1]);
32                c1++;
33            }
34        }
35
36        return result;
37    }
38}
39