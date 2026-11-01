class Solution {
    public int minMergedInteger(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i=i+2){
           /* StringBuilder s = new StringBuilder(String.valueOf(nums[i]));
            s = s.append(String.valueOf(nums[i+1]));*/
            String s1 = String.valueOf(nums[i]);
            String s2 = String.valueOf(nums[i+1]);
            String s = s1.concat(s2);
            if (Integer.parseInt(s) < ans){
                ans = Integer.parseInt(s);
            }
        }
        return ans;
    }
}