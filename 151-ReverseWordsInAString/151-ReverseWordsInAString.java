// Last updated: 8/2/2025, 10:46:14 PM
// class Solution {
//     public String reverseWords(String s) {
//         return  ReverseWords(s);
//     }
//     public static String ReverseWords(String s){
//     s=s.trim();
//         String [] arr= s.split("\s+");
//         String ans = "";
//         for(int i=arr.length-1; i>=0; i--){
//             ans=ans + arr[i]+ " ";

//         }
//         return ans.trim();
        
//     }
// }
// class Solution {
//     public String reverseWords(String s) {
//         return  ReverseWords(s);
//     }
//     public static String ReverseWords(String s){
//     s=s.trim();
//         String [] arr= s.split("\s+");
//         String ans = "";
//         for(int i=arr.length-1; i>=0; i--){
//             ans=ans + arr[i]+ " ";

//         }
//         return ans.trim();
        
//     }
// }

// class Solution {
//     public String reverseWords(String s) {
//         s = s.trim();
//         String[] words = s.split("\\s+");
//         Collections.reverse(Arrays.asList(words));
//         return String.join(" ", words);
//     }
// }


// class Solution {
//     public String reverseWords(String s) {
//         s = s.trim();
//         String[] words = s.split("\\s+");
//         Collections.reverse(Arrays.asList(words));
//         return String.join(" ", words);
//     }
// }
class Solution{
    public String reverseWords(String s){
        s=s.trim();
        String arr[]=s.split("\\s+");
        Collections.reverse(Arrays.asList(arr));
        return String.join(" ",arr);
    }
    
}