class Solution {
    public int countValidPrefixes(String s) {
        int n = s.length();
        int[] count_0 = new int[n];
        int[] count_1 = new int[n];
        if (s.charAt(0) == '0') count_0[0] = 1;
        else count_1[0] = 1;
        int ans = 1;
        for (int i = 1; i < n; i++){
            if (s.charAt(i) == '0'){
                count_0[i] = count_0[i-1] + 1;
                count_1[i] = count_1[i-1];
            }
            else {
                count_1[i] = count_1[i-1] + 1;
                count_0[i] = count_0[i-1];
            }
            if (Math.abs(count_0[i] - count_1[i]) == 1 || Math.abs(count_0[i] - count_1[i]) == 0)
                ans++;
        }
        return ans;
    }
}