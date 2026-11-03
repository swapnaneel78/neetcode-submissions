class Solution {
    public void reverseString(char[] s) {
       for(int i=0,j=s.length-1;i<j;i++,j--){
        swap(i,j,s);
       }
    }

    public static void swap(int i,int j,char[] s){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}