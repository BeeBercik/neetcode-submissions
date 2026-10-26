class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String curr = strs[i];
            char[] currTab = curr.toCharArray();
            Arrays.sort(currTab);
            String sortedCurr = new String(currTab);

            if (map.containsKey(sortedCurr)) {
                map.get(sortedCurr).add(curr);
            } else {
                map.put(sortedCurr, new ArrayList<>(List.of(curr)));
            }

        }

        return new ArrayList<>(map.values());
    }
}
