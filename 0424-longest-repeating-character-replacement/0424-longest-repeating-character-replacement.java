class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, maxfreq = 0, ans = 0;
        int[] arr = new int[26];
        for (int r = 0; r < s.length(); r++){
            arr[s.charAt(r) - 'A']++;
            maxfreq = Math.max(maxfreq, arr[s.charAt(r) - 'A']);
            if ((r - l + 1) - maxfreq > k){
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}