class Solution {
    public int[] productExceptSelf(int[] nums) {
        int idxmul=1;
        int mul[]=new int[nums.length];
        mul[0]=1;
        for(int i=0; i<nums.length-1; i++)
        {
            idxmul *= nums[i];
            mul[i+1]= idxmul;
        }
        idxmul=1;
        for(int i=nums.length-1; i>0; i--)
        {
            idxmul *= nums[i];
            mul[i-1] *=idxmul;
        }
        return mul;
    }
}
