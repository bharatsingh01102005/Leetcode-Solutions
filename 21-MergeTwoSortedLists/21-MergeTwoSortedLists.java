// Last updated: 8/2/2025, 10:47:27 PM
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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Head = new ListNode(0);
        ListNode currt = Head;
        while(list1!= null && list2!=null){
            if(list1.val<list2.val){
                currt.next = list1;
                list1 = list1.next;
            }
            else{
                currt.next = list2;
                list2=list2.next;
            }
            currt=currt.next;
        }
if(list1==null){
    currt.next=list2;
    
}
if(list2==null){
    currt.next=list1;
}
return Head.next;
    }
}