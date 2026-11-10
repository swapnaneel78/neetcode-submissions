class Solution {
    public int characterReplacement(String s, int k) {
       int maxWindow=0;
       int maxFrequency=0;
       int[] freq=new int[26];
       for(int i=0,j=0;i<s.length() && j<s.length() ;i++){
        freq[s.charAt(i)-'A']++;
        maxFrequency=Math.max(maxFrequency,freq[s.charAt(i)-'A']);
        int window=i-j+1;
        if(window-maxFrequency>k){
            freq[s.charAt(j)-'A']--;
            j++;
        }
        maxWindow=Math.max(maxWindow,i-j+1);
       }
       return maxWindow;
    }
}
