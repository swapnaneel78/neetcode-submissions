class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxSpeed=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxSpeed=Math.max(maxSpeed,piles[i]);
        }
        int minSpeed=1;
        int left=1;
        int right=maxSpeed;
        int result=Integer.MAX_VALUE;
        while(left<=right){
            int mid = left + (right-left)/2;
            double sum=0;
            for(int i=0;i<piles.length;i++){
            sum += (piles[i] + mid - 1) / mid;            
            }
            if(sum<=h){
               result=Math.min(result,mid);
               right=mid-1;
            }else{
               left=mid+1;
            }
        }
        return result;
    }

}
