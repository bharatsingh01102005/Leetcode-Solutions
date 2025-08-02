// Last updated: 8/2/2025, 10:45:47 PM
// class Solution {
//     public void reverseString(char[] s) {
//       int start =0;
//       int end =s.length-1;
//       char temp ='0';
//       while(start<end){
//          temp=s[start];
//          s[start]=s[end];
//          s[end]=temp;
//         start++;
//         end--;
//       }
//     }
// }
      
  class Solution {
    public void reverseString(char[] s){
        char temp='0';
        int start = 0;
        int end=s.length-1;
        while(start<end){
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }

    }
  }      
      
    
