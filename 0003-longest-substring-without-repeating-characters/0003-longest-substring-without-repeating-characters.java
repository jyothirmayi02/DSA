class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, ans = 0;
        Set<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        for (int j = 0; j < s.length(); j++){
            while (set.contains(ch[j])){
                set.remove(ch[i]);
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            set.add(ch[j]);
        }
        return ans;
    }
}