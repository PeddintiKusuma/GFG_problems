/*
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/

/*
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                Node curr = queue.poll();

                // take the last element of each level
                if(i == size - 1) {
                    result.add(curr.data);
                }

                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
        return result;
    }
}
