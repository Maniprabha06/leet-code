bool isPalindrome(int x){
    if(x<0 || x!=0 && x%10==0)
    {
        return false;
    }
    if(x/10==0)
    {
        return true;
    }
    long int digit,new=0,temp;
    temp=x;
    while(temp>0)
    {
        digit=temp%10;
        new=new*10+digit;
        temp=temp/10;
        if((new==temp || (x/10)==new))
        {
            return true;
        }
    }
    if(x==new)
    {
        return true;
    }
    else
    {
        return false;
    }
}
