class Solution {
    public int singleNonDuplicate(int[] nums) {
        int last=nums.length-1;
        int st=0;
        int mid=st+(last-st)/2;

        while(st<last)
        {
            mid=st+(last-st)/2;
            if(mid%2==1)
            {
                mid--;
            }
            if(nums[mid]==nums[mid+1])
            {
               st= mid+2;
            }else{
                last=mid;
            }
        }
        return nums[st];
    }
}
