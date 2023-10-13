class Solution {
    public int calculate(String s) {
        Stack<Integer> stk=new Stack<>();
        int res=0,num=0,sign=1;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(int)(c-'0');       // converting string to integer eg: ASCII->0=48 ->c-0->50-48=2->int          
            }
            else if(c=='+')
            {
                res+=sign*num;
                sign=1;
                num=0;
            }
            else if(c=='-')
            {
                res+=sign*num;
                sign=-1;
                num=0;
            }
            else if(c=='('){
                stk.push(res);
                stk.push(sign);
                res=0;
                sign=1;
            }
            else if(c==')')
            {
                res+=sign*num;
                res*=stk.pop();
                res+=stk.pop();
                sign=1;
                num=0;
            }
        }
            if(num>0)
            {
                res+=sign*num;
            }
        return res;
    }
}
