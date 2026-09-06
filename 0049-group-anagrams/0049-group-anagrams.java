class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            if (!mp.containsKey(temp)){
                mp.put(temp, new ArrayList<>());
            }
            mp.get(temp).add(strs[i]); 
        }
        return new ArrayList<>(mp.values());
    }
}