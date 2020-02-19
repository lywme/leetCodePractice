/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode point1=head;
        ListNode point2=null;
        if(head.next!=null)
            point2=head.next;
        else
            return false;

        while(point2.next!=null&&point1!=null&&point2!=null)
        {
            if(point1==point2)
                return true;
            if(point2.next.next!=null)
            {
                point2=point2.next.next;
                point1=point1.next;
            }
            else
                return false;
        }
        return false;
    }
}
