class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {

                int value = map.get(t.charAt(i));

                if (value > 1) {
                    map.put(t.charAt(i), value - 1);
                } else {
                    map.remove(t.charAt(i));
                }

            } else {
                return false;
            }
        }

        return map.isEmpty();
    }
}