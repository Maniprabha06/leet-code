class Solution{
    public int calculate(String s){
        Stack<Integer> stack=new Stack<Integer>();
        int n=s.length();
        int num=0,res=0;
        char sign='+';
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(int)(c-'0');
            }
            if(!Character.isDigit(c) && c!=' ' || i==n-1)
            {
            if(sign == '+'){
                stack.push(num);
            }
            if(sign == '-'){
                stack.push(-num);
            }
            if(sign == '*'){
                stack.push(stack.pop() * num);
            }
            if(sign == '/'){
                stack.push(stack.pop() / num);
            }
            num=0;
            sign=c;
        }
    }
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }
}
