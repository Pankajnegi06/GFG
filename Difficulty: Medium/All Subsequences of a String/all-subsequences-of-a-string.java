class Solution {
    private void subsets(String ans, String s, int idx, List<String> list) {
        if (idx == s.length()) {
            
                list.add(ans);
            
            return;
        }

        char ch = s.charAt(idx);

        // Pick the current character
        subsets(ans + ch, s, idx + 1, list);

        // Skip the current character
        subsets(ans, s, idx + 1, list);
    }

    public List<String> powerSet(String s) {
       List<String> list = new ArrayList<>();
        subsets("", s, 0, list);
        Collections.sort(list);
        return list;
        
    }
}