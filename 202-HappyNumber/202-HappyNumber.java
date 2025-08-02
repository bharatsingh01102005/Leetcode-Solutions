// Last updated: 8/2/2025, 10:46:07 PM
class Solution {
    public int getSquareSum(int n){

        int currentsum=0;
        while(n!=0){
            int rem = (n%10);
            currentsum +=rem*rem;
            n/=10;
        }
        return currentsum;
    }

    public boolean isHappy(int n) {
        int slow = getSquareSum(n);
        int fast = getSquareSum(getSquareSum(n));
        while((slow!=fast) && (fast!=1)){
            slow=getSquareSum(slow);
            fast = getSquareSum(getSquareSum(fast));

        }
        return fast ==1;

        
    }
}