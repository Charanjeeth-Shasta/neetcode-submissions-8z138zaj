class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            char x=t.charAt(i);
            if(map.getOrDefault(x, 0)<=0) return false;
            else map.put(x,map.get(x)-1);
        }
        return true;
    }
}
