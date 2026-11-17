class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int count=0;
        int i=0;
        while(i<word.length()-1){
            if(Math.abs(word.charAt(i)-word.charAt(i+1))<=1) {
                count++;
                i+=2;
            }
            else {
                i++;
            }
        }

        return count;
    }
}