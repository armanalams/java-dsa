class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int[] prefix = new int[n + 1];

        // Build Prefix Sum
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            for (int j = i + l; j <= Math.min(n, i + r); j++) {

                int sum = prefix[j] - prefix[i];

                if (sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
