// Last updated: 8/2/2025, 10:47:43 PM
// class Solution{
//     public int reverse(int x) {
//         int reverse = 0;
//         while(x!=0){
//             int temp = x%10;
//             x=x/10;
           
//             if(reverse>0 && reverse>(Integer.MAX_VALUE - temp)/10 || reverse<0 && reverse<(Integer.MIN_VALUE - temp)/10) return 0;
//              reverse=reverse*10+temp;
//         }
//         return reverse;
//     }
// }
class Solution{
    public int reverse(int x){
        long rev = 0;
        while(x!=0){
            int temp = x%10;
            rev=rev*10+temp;
            x/=10;
            
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }return (int)rev;
    } 
}