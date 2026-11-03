class Solution {
    public boolean validPalindrome(String s) {
       int i = 0;
       int j = s.length() - 1;
       while (i < j) {
        if (s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        } else {
            return ispalin(i + 1, j, s) || ispalin(i, j - 1, s); // Added semicolon
        }
       }
       return true;
    } 
    
    public static boolean ispalin(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false; // Added semicolon
            } 
        }
        return true;
    } 
} // Removed the extra stray closing brace here