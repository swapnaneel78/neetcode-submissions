class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=Integer.MIN_VALUE;
        int right=0;
        int result=Integer.MAX_VALUE;
        for(int i=0;i<weights.length;i++){
            left=Math.max(left,weights[i]);
        }
        for(int i=0;i<weights.length;i++){
            right+=weights[i];
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            int day=1;
            int sum=0;
            for(int i=0;i<weights.length;i++){
               sum+=weights[i];
               if(sum>mid){
                 day++;
                 sum=0;
                 sum+=weights[i];
               }
            }
            if(day>days){
                left=mid+1;
                day=1;
            }else{
                result=Math.min(result,mid);
                right=mid-1;
                day=1;
            }
        }
        return result;
    }
}