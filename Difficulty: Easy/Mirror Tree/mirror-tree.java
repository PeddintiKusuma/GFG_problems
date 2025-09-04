/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    void mirror(Node node) {
        // code here
        if(node==null) return;
        //swap left and right children
        Node temp=node.left;
        node.left=node.right;
        node.right=temp;
        //recursively do this for left and right sub tree
        mirror(node.left);
        mirror(node.right);
    }
}