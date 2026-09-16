class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        s = s.replace(/[^a-z0-9]/gi, '').toLowerCase();
        let j=s.length-1;
        for(let i=0;i<=s.length/2;i++){
            if(s.charAt(i)!=s.charAt(j)){
                return false
            }
            j--;
        }
        return true;
    }
}