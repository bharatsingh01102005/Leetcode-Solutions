// Last updated: 8/2/2025, 10:43:43 PM
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] diff=new int[n+1];

        for(int[] q:queries)
        {
            diff[q[0]]--;
            if(q[1]+1 < n)
               diff[q[1]+1]++;
        }

        int sum=0; //Calculating running sum

        for(int i=0;i<n;i++)
        {
            sum+=diff[i];
            if(nums[i] > -sum)
              return false;
        }
        return true;
    }
}