class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int r= n % k;
        
        rotate2(nums,0,n-1);
        rotate2(nums,0,k-1);
        rotate2(nums,k,n-1);
        
        
    }
    public void rotate2(int[]nums,int s, int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}
