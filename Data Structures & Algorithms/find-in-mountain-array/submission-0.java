/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
     int left=0;
     int right=mountainArr.length()-1;
     while(left<=right){
        int mid=left+(right-left)/2;
        int data1=mountainArr.get(mid);
        int data2=mountainArr.get(mid+1);
        if(data1<data2){
            left=mid+1;
        }else{
            right=mid-1;
        }
     }
     int peak=left;
     int a=0;
     int b=peak;
     while(a<=b){
        int mid=a+(b-a)/2;
        int data=mountainArr.get(mid);
        if(data==target){
            return mid;
        }else if(data>target){
            b=mid-1;
        }else{
            a=mid+1;
        }
     }

     int k=peak+1;
     int l=mountainArr.length()-1;
     while(k<=l){
        int mid=k+(l-k)/2;
        int data=mountainArr.get(mid);
        if(data==target){
            return mid;
        }else if(data>target){
            k=mid+1;
        }else{
            l=mid-1;
        }
     }
     return -1;
    }
}