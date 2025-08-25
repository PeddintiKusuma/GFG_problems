/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
 
class Solution{
 ArrayList<Integer>  leftView(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size(); //1
            //traverse all nodes at that level
            for(int i=0;i<size;i++){
                Node curr = queue.poll();
                if(i==0){
                    result.add(curr.data);
                }
                if(curr.left!=null){
                    queue.add(curr.left);

                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
          

        }
        return result;

}

    }