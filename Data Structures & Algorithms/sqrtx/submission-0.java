class Solution {
    public int mySqrt(int x) {
        int left=1;
        int right=x;
        while(left<=right){
            int mid=left+((right-left)/2);
            int res=x/mid;
            if(res==mid){
                return mid;
            }else if(res<mid){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return right;
        
    }
}