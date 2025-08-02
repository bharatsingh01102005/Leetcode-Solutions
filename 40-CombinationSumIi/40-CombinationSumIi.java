// Last updated: 8/2/2025, 10:47:06 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(result, new ArrayList<>(), candidates, target, 0, 0);
        return result;
    }

    private void backtracking(List<List<Integer>> result, List<Integer> path, int[] candidates, int target, int start, int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (sum + candidates[i] > target) break;

            path.add(candidates[i]);
            backtracking(result, path, candidates, target, i + 1, sum + candidates[i]);
            path.remove(path.size() - 1);
        }
    }
}