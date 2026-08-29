class Solution {
    public String[] largestString(int[] nums) {
        int n = nums.length;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++){
            int x = nums[i];
            StringBuilder sb = new StringBuilder();
            int zcount = x / (1 << 25);
            while (zcount-- > 0){
                sb.append('z');
            }
            x = x % (1 << 25);
            for (int j = 24; j >= 0; j--){
                int power = 1 << j;
                if (x >= power){
                    sb.append((char)('a' + j));
                    x = x - power;
                }
            }
            ans[i] = sb.toString();
        }
        return ans;
    }
}