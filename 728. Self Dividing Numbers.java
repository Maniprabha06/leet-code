class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            int digit;
            int flag=0;
            int num=i;
            while(num>0)
            {
                digit=num%10;
                if(digit==0)
                {
                    flag=1;
                    break;
                }
                if(i%digit!=0)
                {
                    flag=1;
                    break;
                }
                num=num/10;
            }
            if(flag==0)
            {
                list.add(i);
            }
        }
        return list;
    }
}