// Last updated: 8/2/2025, 10:46:08 PM
class Solution {
    public String largestNumber(int[] nums) {
    String str[] = new String[nums.length]; 
    for(int i=0; i<nums.length; i++)
        str[i] = Integer.toString(nums[i]);
    Arrays.sort(str, (a, b)->(b+a).compareTo(a+b));

    if(str[0].equals("0"))
    return "0";
    StringBuilder sb = new StringBuilder();
    for(String s : str)
    sb.append(s);
    return sb.toString();
    }
}