// Last updated: 8/2/2025, 10:47:21 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != val) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        return writeIndex;
    }
}