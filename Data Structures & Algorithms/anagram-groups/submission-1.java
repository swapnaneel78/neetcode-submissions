class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, String[]> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);

            String a = new String(chars);

            if (!map.containsKey(a)) {
                map.put(a, new String[]{strs[i]});
            } else {

                String[] arr = Arrays.copyOf(
                    map.get(a),
                    map.get(a).length + 1
                );

                arr[arr.length - 1] = strs[i];

                map.put(a, arr);
            }
        }

        List<List<String>> result = new ArrayList<>();

        for (String[] arr : map.values()) {
            result.add(Arrays.asList(arr));
        }

        return result;
    }
}