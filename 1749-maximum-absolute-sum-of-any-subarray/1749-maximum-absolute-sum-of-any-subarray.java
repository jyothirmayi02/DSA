class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxInt = 0, minInt = 0;
        int maxSum = 0, minSum = 0;
        for (int i : nums){
            maxInt = Math.max(0, maxInt + i);
            minInt = Math.min(0, minInt + i);

            maxSum = Math.max(maxSum, maxInt);
            minSum = Math.min(minSum, minInt);
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}