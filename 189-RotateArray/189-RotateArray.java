// Last updated: 8/2/2025, 10:46:10 PM
// class Solution {
//     public void rotate(int[] nums, int k) {
//         RotateArray(nums,k); }

//         public static void RotateArray(int arr[], int k) {
// 		int n=arr.length;
// 		k=k%n;
// 		Reverse(arr,0,n-1);
// 		Reverse(arr,0,k-1);
// 		Reverse(arr,k,n-1);	
// 	}
// 	public static void Reverse(int[] arr, int i, int j) {
// 		while(i<j) {
// 			int temp=arr[i];
// 			arr[i]=arr[j];
// 			arr[j]=temp;
// 			i++;
// 			j--;
// 		}    
//     }   
// }

class Solution {
    public void rotate(int[] nums, int k) {
        Rotatearray(nums, k);
    }

    public static void Rotatearray(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases when k > n
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

    
