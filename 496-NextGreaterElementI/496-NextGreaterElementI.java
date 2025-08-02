// Last updated: 8/2/2025, 10:45:37 PM
class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        int[] res = new int[num1.length];
        for(int i = 0;i<num1.length;i++){
            boolean flag = false;
            for(int j = 0;j<num2.length;j++){
                if(num1[i] == num2[j]){
                    flag = true;
                }
                if(flag==true && num1[i]<num2[j]){
                    res[i] = num2[j];
                    break;
                }
            }
        }
        for(int i=0;i<res.length;i++){
            if(res[i]==0){
                res[i] = -1;
            }
        }
        return res;
            
    }
}