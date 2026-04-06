class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String i:strs){
            sb.append(i.length()).append('#').append(i);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#') j++;
            int l=Integer.parseInt(str.substring(i,j));
            i=j+1;
            decoded.add(str.substring(i,i+l));
            i+=l;
        }
        return decoded;
    }
}
