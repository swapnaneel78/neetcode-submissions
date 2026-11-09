class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash = new HashSet<>();
        int res = 0;

        for(int i = 0, j = 0; i < s.length(); i++) {

            while(hash.contains(s.charAt(i))) {
                hash.remove(s.charAt(j));
                j++;
            }

            hash.add(s.charAt(i));

            int temp = i - j + 1;
            res = Math.max(temp, res);
        }

        return res;
    }
}