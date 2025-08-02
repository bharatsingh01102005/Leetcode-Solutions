// Last updated: 8/2/2025, 10:46:03 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode reverseList(ListNode head) {
        
//         ListNode prev = null;
//         ListNode next = null;
//         ListNode curr = head;

//         while(curr != null)
//         {
//             next = curr.next;

//             curr.next = prev;

//             prev = curr;
//             curr = next;
//         }

//         return prev;
//     }
// }
// class Solution{
//     public ListNode reverseList(ListNode head){
//         ListNode current = head;
//         ListNode prev = null;
//         ListNode next = null;
//         while(current != null){
//             next = current.next;
//             current.next=prev;
//             prev = current;
//             current=next;
//         }
//         return prev;
//     }
// }

// class Solution{
//     public ListNode reverseList(ListNode head){
//         ListNode current = head;
//         ListNode prev = null;
//         ListNode next = null;
//         while(current != null){
//             next = current.next;
//             current.next=prev;
//             prev=current;
//             current=next;

//         }
//         return prev;
//     }
// }

// class Solution{
//     public ListNode reverseList(ListNode head){
//         ListNode current = head;
//         ListNode prev = null;
//         ListNode next = null;
//         while(current != null){
//             next = current.next;
//             current.next=prev;
//             prev=current;
//             current= next;
//         }
//         return prev;

//     }
// }


class Solution{
    public ListNode reverseList(ListNode head ){
        ListNode current = head;
        ListNode prev=null;
        ListNode next = null;
        while(current!=null){
            next=current.next;
            current.next = prev;
            prev=current;
            current=next;
        }
        return prev;
       
    }
}