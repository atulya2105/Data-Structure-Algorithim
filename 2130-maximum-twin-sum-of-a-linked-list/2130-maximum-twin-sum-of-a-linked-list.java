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
    int len = 0;
    ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = null;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            len++;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int mx = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = reverse(slow);
        while(prev!=null){
            mx = Math.max(mx,prev.val+head.val);
            prev = prev.next;
            head = head.next;
        }
        
        return mx;
    }
}