// Last updated: 8/2/2025, 10:44:15 PM
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>(words.length);
        result.add(words[0]);
        int last = groups[0];
        for (int i = 1; i < words.length; i++) {
            if (groups[i] != last) {
                result.add(words[i]);
                last = groups[i];
            }
        }
        return result;
    }
}