// Last updated: 8/2/2025, 10:45:44 PM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        int[] buf = new int[n];
        int curr = 1;
        for (int i = 0; i < n; i++) {
            buf[i] = curr;
            if (curr * 10 <= n) {
                curr *= 10;
            } else {
                if (curr >= n) curr /= 10;
                curr++;
                while (curr % 10 == 0) curr /= 10;
            }
        }
        List<Integer> res = new ArrayList<>(n);
        for (int v : buf) res.add(v);
        return res;
    }
}