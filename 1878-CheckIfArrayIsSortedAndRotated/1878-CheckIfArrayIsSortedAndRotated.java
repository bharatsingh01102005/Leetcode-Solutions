// Last updated: 8/2/2025, 10:45:04 PM
// class Solution {
//     public boolean check(int[] nums) {
//         int count = 0, n = nums.length;
        
//         for (int i = 0; i < n; i++) {
//             if (nums[i] > nums[(i + 1) % n]) 
//                 count++;
//             if (count > 1) 
//                 return false;
//         }
        
//         return true;
//     }
// }
// class Solution {
//     public boolean check(int[] nums) {
//        int count =0, n=nums.length;
//        for(int i=0; i<n; i++){
//         if(nums[i]>nums[(i+1)%n])
//         count++;
//         if(count>1)
//         return false;
//         }
//     return true;
//     }
       
// }
class Solution{
    public boolean check(int [] nums){
        int count =0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>nums[(i+1)%n])
            count++;
            if(count>1)
            return false;
        }
        return true;
    }
}

