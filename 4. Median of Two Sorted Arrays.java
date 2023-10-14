import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length,b=nums2.length;
        int[] num=new int[a+b];
        System.arraycopy(nums1,0,num,0,a);
        System.arraycopy(nums2,0,num,a,b);
        Arrays.sort(num);
        if((a+b)%2!=0){
            return num[(a+b)/2];
        }
        else{
            double fir=num[((a+b)/2)-1];
            double sec=num[(a+b)/2];
            return (fir+sec)/2.00;
        }
    }
}