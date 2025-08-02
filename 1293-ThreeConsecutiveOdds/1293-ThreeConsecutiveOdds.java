// Last updated: 8/2/2025, 10:45:19 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
            count++;
            if(count == 3){
                return true;

            }
        } else {
            count = 0; 
           }
        }
        return false;
        
    }
}