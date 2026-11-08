class Solution {
    public long countValidSubstrings(String s) {
        int n = s.length();
        long invalid = 0;
        int last = -1;
        for (int i = 0; i<n-2; i++) {
            if (s.substring(i,i+3).equals("abc")) {
                last = i;
            }
            invalid += last + 1;
        }
        long total =(long)n*(n + 1)/2;
        return total - invalid;
    }
}