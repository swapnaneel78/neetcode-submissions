class Solution {
    public String minWindow(String s, String t) {
       int[] maps= new int[128];
       int[] mapt=new int[128];
       int minlength=Integer.MAX_VALUE;
       String data="";
       int left=0;
       for(int i=0;i<t.length();i++){
           mapt[t.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            maps[s.charAt(i)]++;
            while(isValid(maps,mapt)){
                if(minlength>i-left+1){
                    minlength=i-left+1;
                    data=s.substring(left,i+1);
                }
                maps[s.charAt(left)]--;
                left++;
            }
        }
        return data;
    }
    
    public static boolean isValid(int[] maps, int[] mapt){
        for(int i=0;i<mapt.length;i++){
            if(mapt[i]>maps[i]){
                return false;
            }
        }
        return true;
    }
}
