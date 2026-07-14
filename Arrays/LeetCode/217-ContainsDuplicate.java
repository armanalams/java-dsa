/*
LeetCode 217 - Contains Duplicate

Approach:
- HashSet
- Time Complexity: O(n)
- Space Complexity: O(n)
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
                set.add(nums[i]);
           
        }
         return false;
        
    }
    
}
