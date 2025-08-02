// Last updated: 8/2/2025, 10:45:34 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int i = 1;
        int sum = 0;
        while(i<num){
            if(num%i == 0){
                sum += i;
            }
            i++;
        }
        return (sum==num);
    }
}