class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i<word.length()) {
            st.push(word.charAt(i));
            if(word.charAt(i)==ch) {
                break;
            }
            i++;
        }
        if(i ==word.length()) {
            return word;
        }
        while(!st.isEmpty()) {
            result.append(st.pop());
        }
        result.append(word.substring(i+1));
        return result.toString();
    }
}