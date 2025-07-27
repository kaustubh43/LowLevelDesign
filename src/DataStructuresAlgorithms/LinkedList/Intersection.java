package DataStructuresAlgorithms.LinkedList;

public class Intersection {
    public static int findIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 =  headA, l2 = headB;

        while(l1 != l2){
            if(l1 == null){
                l1 = headB;
            }
            else{
                l1 = l1.next;
            }
            if(l2 == null){
                l2 = headA;
            }
            else{
                l2 = l2.next;
            }
        }
        return l1 == null? -1: l1.val;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = new ListNode(6);
        headB.next.next.next = new ListNode(9);
        headB.next.next.next.next = headA.next.next;

        headA.next.next.next = new ListNode(7);
        headA.next.next.next.next = new ListNode(8);

        System.out.println(findIntersectionNode(headA, headB));
    }
}
