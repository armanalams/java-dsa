class Solution {
    public int subarraySum(int[] nums, int k) {
        int currSum=0;
        int count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0; i<nums.length; i++)
        {
            currSum+=nums[i];
            if(hm.containsKey(currSum-k))
            {
                count+=hm.get(currSum-k);
                
            }if(hm.containsKey(currSum)){
                hm.put(currSum,hm.get(currSum)+1);
            }else{
                hm.put(currSum, 1);
            }
           
        }
        return count;
    }
}
