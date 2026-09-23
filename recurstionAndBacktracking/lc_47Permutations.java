class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums, ans, new ArrayList<>(), used);

        return ans;
    }

    public void backtrack(int[] nums,
                           List<List<Integer>> ans,
                           List<Integer> curr,
                           boolean[] used) {

        // Base case
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Already used in current permutation
            if (used[i]) {
                continue;
            }

            // Skip duplicate at the same level
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            // Choose
            curr.add(nums[i]);
            used[i] = true;

            // Explore
            backtrack(nums, ans, curr, used);

            // Undo
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}
