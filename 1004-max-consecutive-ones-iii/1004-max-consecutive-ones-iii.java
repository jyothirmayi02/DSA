class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = Integer.MIN_VALUE, i = 0, j = 0;
        /*if (k == 0){
            int l = 0;
            for (int x : nums){
                if (x == 1) l++;
            }
            return l;
        }*/
        while (j < nums.length){
            if (nums[j] == 0){
                if (k == 0){
                    while (nums[i] != 0)
                        i++;
                    i++;
                }
                else{
                    k--;
                }
            }
            j++;
            max = Math.max(max, j-i);
        }
        return max;
    }
}