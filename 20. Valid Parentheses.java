class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' ||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                stack.push(s.charAt(i));
            }
            else {
                if(stack.empty()){
                   return false;
                }
            if(s.charAt(i)==')'){
                if(stack.pop()=='('){
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)=='}'){
                if(stack.pop()=='{'){
                    continue;
                }
                else{
                    return false;
                }
            }else if(s.charAt(i)==']'){
                if(stack.pop()=='[') {
                    continue;
                }
                else{
                    return false;
                }
                }

            }
        }
        return stack.empty();
    }
}

