class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans =new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] sortedarr=strs[i].toCharArray();
            Arrays.sort(sortedarr);
            String sorted=new String(sortedarr);

            ans.putIfAbsent(sorted,new ArrayList<>());
            ans.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(ans.values());

    }
}
