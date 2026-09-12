class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();

        cal(k, n, ans, new ArrayList<>(), 1, 0);

        return ans;
    }

    public void cal(int k, int n, List<List<Integer>> ans,
                    List<Integer> curr, int i, int sum) {

        if (curr.size() == k) {
            if (sum == n) {
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        if (sum > n || i > 9) {
            return;
        }

        // Choose i
        curr.add(i);
        cal(k, n, ans, curr, i + 1, sum + i);
        curr.remove(curr.size() - 1);

        // Don't choose i
        cal(k, n, ans, curr, i + 1, sum);
    }
}
