

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

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize a dummy node to simplify appending to the result list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Loop through both lists and handle carry at each step
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with the carry from the previous iteration
            if (l1 != null) {
                sum += l1.val; // Add l1's value if it exists
                l1 = l1.next;  // Move to the next node in l1
            }
            if (l2 != null) {
                sum += l2.val; // Add l2's value if it exists
                l2 = l2.next;  // Move to the next node in l2
            }

            // Update carry and set the current node's next value
            carry = sum / 10; // Extract carry
            current.next = new ListNode(sum % 10); // Create a new node with the digit
            current = current.next; // Move the pointer forward
        }

        // Return the head of the new list
        return dummyHead.next;
    }
}
