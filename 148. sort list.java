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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ArrayList<Integer> ans=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            ans.add(cur.val);
            cur=cur.next;
        }
        Collections.sort(ans);
        cur=head;
        while(cur!=null){
            cur.val=ans.remove(0);
            cur=cur.next;
        }
        return head;
    }
}