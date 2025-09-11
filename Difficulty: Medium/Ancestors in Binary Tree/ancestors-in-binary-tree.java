/*class Node of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        ArrayList<Integer> res= new ArrayList<>();
        findAncestors(root,target,res);
        
        
        return res;
    }
    
    public boolean findAncestors(Node root,int target,ArrayList<Integer> res){
        if(root==null) return false;
        if(target== root.data) return true;
        if(findAncestors(root.left,target,res)|| findAncestors(root.right,target,res)){
            res.add(root.data);
            return true;
            
        }
        return false;
    }
}