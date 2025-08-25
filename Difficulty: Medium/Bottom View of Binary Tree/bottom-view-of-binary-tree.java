/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        TreeMap<Integer, Integer> map=new TreeMap<>();
        Queue<Node> queue=new LinkedList<>();
        
        root.hd=0;
        queue.add(root);
        while(!queue.isEmpty()){
            Node curr=queue.poll();
            int hd=curr.hd;
            
            map.put(hd,curr.data);
            if(curr.left!=null){
                curr.left.hd=hd-1;
                queue.add(curr.left);
            }
            if(curr.right!=null){
                curr.right.hd=hd+1;
                queue.add(curr.right);
            }
        }
        for(int val:map.values()){
            result.add(val);
        }
        return result;
    }
    
}