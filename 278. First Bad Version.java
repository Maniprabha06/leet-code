/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int mid;
        while(start<=end){
            mid=((end-start)/2)+start;
            if(isBadVersion(mid)==false){
                start=mid+1;
            }
            else
            {
                if(isBadVersion(mid-1)==false){
                    return mid;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return end;
    }
}