class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; //bat
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < Math.min(prefix.length(), strs[i].length())) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0, j); //ba
        }
        return prefix;
    }
}
