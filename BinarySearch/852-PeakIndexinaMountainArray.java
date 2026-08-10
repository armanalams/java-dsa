class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int end=arr.length-1;
        

        while(s!=end)
        {
            int mid=(s+end)/2;
            if(arr[mid]<arr[mid+1])
            {
                s=mid+1;
            }else if(arr[mid]<arr[mid-1])
            {
                end=mid-1;
            }else {return mid;}

            if(s==end)
            {
                return s;
            }
        }
        return -1;
    }
}
