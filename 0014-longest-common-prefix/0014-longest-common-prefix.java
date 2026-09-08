class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        Arrays.sort(strs);
        String x = strs[0], y = strs[strs.length - 1], prefix = "";
        for (int i = 0; i < x.length(); i++){
            if (x.charAt(i) == y.charAt(i)){
                prefix = x.substring(0, i+1);
            }
            else
                return prefix;
        }
        return prefix;
    }
}