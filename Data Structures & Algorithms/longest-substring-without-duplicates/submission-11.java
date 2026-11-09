class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hash=new HashSet<>();
        int res=0;
        for(int i=0,j=0;i<s.length() && j<s.length();i++){
            while(hash.contains(s.charAt(i))){
                hash.remove(s.charAt(j));
                j++;
            }
            hash.add(s.charAt(i));
            res=Math.max(res,i-j+1);
        }
        return res;
    }
}
