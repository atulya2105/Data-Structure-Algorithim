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
    ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = null;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode prev = null;
        int cnt = 1;
        while(cnt!=left){
            prev = curr;
            curr = curr.next;
            cnt++;
        }
        ListNode start = curr;
        while(cnt!=right){
            curr = curr.next;
            cnt++;
        }
        ListNode temp = curr.next;
        curr.next=null;
        ListNode newHead = reverse(start);
        if(prev!=null){
            prev.next = newHead;
        }
        curr = newHead;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        if(left==1){
            return newHead;
        }else{
            return head;
        }
        
    }
}