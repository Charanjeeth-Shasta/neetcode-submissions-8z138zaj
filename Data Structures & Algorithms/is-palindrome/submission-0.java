class Solution {
    public boolean isPalindrome(String s) {
        String new_str=s.replaceAll("[^a-zA-Z0-9]","");
        return helper(new_str.toLowerCase());
    }

    public boolean helper(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
