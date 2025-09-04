/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) {
        //  code here
        if(root==null){
            return true; //empty tree is valid
        }
        if(root.left==null && root.right==null)
        return true;//left node is valid 
        
        int leftVal=(root.left!=null) ?root.left.data:0;
        int rightVal=(root.right!= null)? root.right.data:0;
        
        return (root.data==leftVal+rightVal) && isSumProperty(root.left)&& isSumProperty(root.right);
    }
}