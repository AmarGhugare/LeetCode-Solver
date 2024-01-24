package problem1to100;

/**
 * A class that represents a node in a singly linked list.
 * Each node contains an integer value and a reference to the next node in the
 * list.
 */
class ListNode {
    int val;
    ListNode next;

    /**
     * Constructs a new node with the default value of 0 and no next node.
     */
    ListNode() {
        this(0, null);
    }

    /**
     * Constructs a new node with the given value and no next node.
     * 
     * @param val the value to be stored in this node
     */
    ListNode(int val) {
        this(val, null);
    }

    /**
     * Constructs a new node with the given value and the given next node.
     * 
     * @param val  the value to be stored in this node
     * @param next the reference to the next node in the list
     */
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * Add Two Numbers
 * <p>
 * This class contains a solution for the LeetCode problem 2: Add Two Numbers.
 * The problem statement is as follows:
 * </p>
 * <p>
 * You are given two non-empty linked lists representing two non-negative
 * integers.
 * The digits are stored in reverse order, and each of their nodes contains a
 * single digit.
 * Add the two numbers and return the sum as a linked list.
 * </p>
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * </p>
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">LeetCode
 *      Problem 2</a>
 * @version 1.0
 * @author Amar Ghugare
 */
public class Problem0002 {
    /**
     * Adds two numbers represented by linked lists and returns the sum as a linked
     * list.
     * 
     * @param l1 the first linked list representing a non-negative integer
     * @param l2 the second linked list representing a non-negative integer
     * @return the sum of l1 and l2 as a linked list
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode current = ans;
        int carry = 0; // the carry over from previous addition

        // Retrive values till both listlist come to an end
        while (l1 != null || l2 != null) {
            // the value of the current node of l1 and l2, or 0 if node is null
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;

            int sum = num1 + num2 + carry;
            carry = sum / 10;

            // Fill answer Node in order
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            // move to next nodes of l1 and l2
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        // add the remaining carray to end of the answe list
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return ans.next;
    }

    public static void main(String[] args) {
        Problem0002 p0002 = new Problem0002();
        ListNode l1;
        ListNode l2;
        ListNode ans;

        // Example 1
        l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ans = p0002.addTwoNumbers(l1, l2);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
        System.out.println();

        // Example 2
        l1 = new ListNode(0);
        l2 = new ListNode(0);
        ans = p0002.addTwoNumbers(l1, l2);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
        System.out.println();

        // Example 3
        l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))));
        l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ans = p0002.addTwoNumbers(l1, l2);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
        System.out.println();
    }
}
