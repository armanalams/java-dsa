class Solution {
    public int[] searchRange(int[] nums, int target) {
      
        int frist =  findidx(nums, target, true);
        int last= findidx(nums,target, false);

        return new int[]{frist,last};

    }
    public int findidx(int[] nums, int target, boolean isFrist){
        int st=0;
        int end=nums.length-1;
        int ans=-1;

        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                ans=mid;
                if(isFrist){
                    end=mid-1;
                }else{
                    st=mid+1;
                }

            }
            else if(nums[mid]<target) st=mid+1;
            else end=mid-1;
        }
        return ans;
    }
}
