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
        ListNode temp = null;
        ListNode prev = null;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode ans = null;
        ListNode tail = null;
        int carry = 0;
        while(l1!=null || l2!=null){
            int sum = 0;
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            sum  = sum%10;
            if(ans==null){
                ans = new ListNode(sum);
                tail = ans;
            }
            else{
                tail.next = new ListNode(sum);
                tail = tail.next;
            }
        }
        if(carry>0){
           if(ans==null){
                ans = new ListNode(carry);
                tail = ans;
            }
            else{
                tail.next = new ListNode(carry);
                tail = tail.next;
            } 
        }
        ans = reverse(ans);
        return ans;
    }
}