class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let left = 0;
        let right = heights.length - 1;
        let volume = 0;

        while (left < right) {
            let minHeight = Math.min(heights[left], heights[right]);
            let width = right - left;

            volume = Math.max(volume, minHeight * width);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return volume;
    }
}