class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        backtracking(candidates, target, result, new ArrayList<>(), 0);

        return result;
    }

    public static void backtracking(int[] candidates,
                                    int target,
                                    List<List<Integer>> result,
                                    List<Integer> current,
                                    int start) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Duplicate combination ko skip karo
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Agar current number target se bada hai
            if (candidates[i] > target) {
                break;
            }

            // YES
            current.add(candidates[i]);

            // Same element dobara use nahi hoga
            backtracking(candidates,
                         target - candidates[i],
                         result,
                         current,
                         i + 1);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}
