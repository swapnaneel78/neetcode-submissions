class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            arr1.add(arr[i]);
        }
        arr1.sort((a,b)->{
            if(Math.abs(a-x)==Math.abs(b-x)){
                return a-b;
            }
            return Math.abs(a-x)-Math.abs(b-x);
        });
        List<Integer>result=new ArrayList<>();
        for(int i=0;i<k;i++){
            result.add(arr1.get(i));
        }
        result.sort((a,b)->a-b);
        return result;

    }
}