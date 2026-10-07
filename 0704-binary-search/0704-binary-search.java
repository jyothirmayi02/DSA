class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = binarysearch(nums, low, high, target);
        return ans;
    }
    int binarysearch(int[] nums, int low, int high, int target){
        if (low > high) return -1;
        int mid = (low + high)/2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) 
            return binarysearch(nums, low, mid-1, target);
        return binarysearch(nums, mid+1, high, target);
    }
}