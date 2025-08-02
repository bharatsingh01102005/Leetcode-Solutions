// Last updated: 8/2/2025, 10:45:57 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        return Array_Except_Self(nums);
    }
     public static int [] Array_Except_Self(int []arr){
        int n = arr.length;
        int left[] = new int[n];
        left[0]=1;
        for(int i =1; i<left.length; i++){
            left[i]=left[i-1]*arr[i-1];
        }
        int right[] = new int[n];
        right[n-1]=1;
        for (int i=n-2; i>=0; i--){
            right[i]=right[i+1]*arr[i+1];

        }
        for(int i =0; i<right.length; i++){
            left[i]=left[i]*right[i];
        }
        return left;
      


    }
    
}