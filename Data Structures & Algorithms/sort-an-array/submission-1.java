class Solution {

    public int[] sortArray(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find min and max
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // Create count array
        int[] arr = new int[max - min + 1];

        // Count numbers
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - min]++;
        }

        // Create result
        int[] result = new int[nums.length];

        int index = 0;

        // Reconstruct sorted array
        for (int i = 0; i < arr.length; i++) {

            while (arr[i] > 0) {
                result[index] = i + min;
                index++;
                arr[i]--;
            }
        }

        return result;
    }
}