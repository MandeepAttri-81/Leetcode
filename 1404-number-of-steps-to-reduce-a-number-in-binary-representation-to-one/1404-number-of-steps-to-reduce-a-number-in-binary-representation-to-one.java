class Solution {
    public int numSteps(String s) {
        int count = 0;
        while (!s.equals("1")) {
            if (s.charAt(s.length() - 1) == '0') {
                s = s.substring(0, s.length() - 1);
            } else {
                s = addOne(s);
            }
            count++;
        }

        return count;
    }
    public String addOne(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == '1') {
            i--;
        }
        if (i == -1) {
            return "1"+"0".repeat(s.length());
        }
        return s.substring(0, i)+"1"+"0".repeat(s.length()-i-1);
    }
}