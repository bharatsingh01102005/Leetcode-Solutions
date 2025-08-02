// Last updated: 8/2/2025, 10:44:01 PM
public class Solution {
    public String triangleType(int[] nums) {
        if (nums[0] == nums[1] && nums[1] == nums[2])
            return "equilateral";
        else if ((nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2])
                 && nums[0] + nums[1] > nums[2]
                 && nums[1] + nums[2] > nums[0]
                 && nums[0] + nums[2] > nums[1])
            return "isosceles";
        else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]
                 && nums[0] + nums[1] > nums[2]
                 && nums[1] + nums[2] > nums[0]
                 && nums[0] + nums[2] > nums[1])
            return "scalene";
        return "none";
    }
}