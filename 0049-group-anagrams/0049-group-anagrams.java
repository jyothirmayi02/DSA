class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (String x : strs){
            char[] ch = x.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if (!mp.containsKey(s)){
                mp.put(s, new ArrayList<>());
            }
            mp.get(s).add(x);
        }
        return new ArrayList<>(mp.values());
    }
}