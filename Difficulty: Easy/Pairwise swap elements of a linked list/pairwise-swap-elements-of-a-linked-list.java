/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
         Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            // Nodes to be swapped
            Node first = prev.next;
           Node second = first.next;

            // Swapping nodes
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move to the next pair
            prev = first;
        }

        return dummy.next;
    }
}