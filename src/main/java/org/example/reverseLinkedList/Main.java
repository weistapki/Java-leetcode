package org.example.reverseLinkedList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode four = new ListNode(4, null);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);
        ListNode inversion = solution.reverseList(head);

        System.out.println("The Inverted list : ");
        while (inversion != null) {
            System.out.print(inversion.val + " ");
            inversion = inversion.next;
        }
    }
}
