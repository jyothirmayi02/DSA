class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            if (ans.contains(x)){
                res[0] = ans.indexOf(x);
                res[1] = i;
                break;
            }
            ans.add(nums[i]);
        }
        return res;
    }
}