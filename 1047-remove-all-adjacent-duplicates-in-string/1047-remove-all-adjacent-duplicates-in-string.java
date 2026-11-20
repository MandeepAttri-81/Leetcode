class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> ans =new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(!ans.isEmpty()&&ans.peek()==ch){
                ans.pop();
            }
            else{
                ans.push(ch);
            }
        }
         StringBuilder sb = new StringBuilder();
         while(!ans.isEmpty()){
            sb.append(ans.pop());
         }
        
       return sb.reverse().toString();
    }
}