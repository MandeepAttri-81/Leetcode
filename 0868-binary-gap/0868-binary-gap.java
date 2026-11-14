class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int maxcount = 0;
        int prev=-1;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='1') {
                if (prev !=-1) {
                    int count =i-prev;
                    maxcount =Math.max(maxcount,count);
                }
                prev = i;
            }
        }

        return maxcount;
    }
}