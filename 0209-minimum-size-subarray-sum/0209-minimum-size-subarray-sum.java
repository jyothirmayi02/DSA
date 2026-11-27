class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE, i = 0, n = nums.length;
        for (int j = 0; j < n; j++){
            sum = sum + nums[j];
            while (sum >= target){
                min = Math.min(min, j-i+1);
                sum = sum - nums[i];
                i++;
            }
        }
        if (min == Integer.MAX_VALUE) return 0;
        return min;
    }
}