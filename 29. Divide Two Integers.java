class Solution {
    public int divide(int div, int di) {
        if(div==-2147483648 && di==-1) return 2147483647;
        return div/di;
    }
}