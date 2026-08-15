class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        backtracking(nums, new ArrayList<>(), ans, 0);
        return ans;

    }

public static void backtracking (int[] nums, List<Integer> current, List<List<Integer>> ans, int idx )
{
    if(idx==nums.length)
    {
        ans.add(new ArrayList<>(current));
        return;
    }
    current.add(nums[idx]);
    backtracking(nums, current, ans, idx +1);

    current.remove(current.size()-1);

    backtracking(nums, current, ans, idx + 1);

    
}
}
