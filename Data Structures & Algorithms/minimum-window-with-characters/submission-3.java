class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        int resIdx = 0;
        int resLen = Integer.MAX_VALUE;
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for(char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        int need = countT.size();
        int have = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if(countT.containsKey(c) && window.get(c).equals(countT.get(c))) {
                have++;
            }
            while(have == need) {
                if(r - l + 1 < resLen) {
                    resLen = r - l + 1;
                    resIdx = l;
                }
                char remove = s.charAt(l);
                window.put(remove, window.get(remove) - 1);
                if(countT.containsKey(remove) && window.get(remove) < countT.get(remove)) {
                    have--;
                }
                l++;
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(resIdx, resIdx + resLen);
    }
}
