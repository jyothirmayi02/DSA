class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        //int i = 0, j = n -1, k = 1;
        Set<List<Integer>> ans = new HashSet<>();
        //Arrays.sort(nums);
        int k = 0;
        for (int i = 0; i < n; i++){
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < n && j != i; j++){
                int target = -nums[i];
                if (set.contains(target - nums[j])){
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]); inner.add(target - nums[j]); inner.add(nums[j]);
                    Collections.sort(inner);
                    ans.add(inner);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}