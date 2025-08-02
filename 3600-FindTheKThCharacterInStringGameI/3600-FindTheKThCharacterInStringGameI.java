// Last updated: 8/2/2025, 10:43:58 PM
class Solution {
  public char kthCharacter(int k) {
    return (char) ('a' + Integer.bitCount(k - 1));
  }
}