/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/
 

class Solution {
    static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // add your code here
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        if(root== null){
            return result;
        }
        
        //create a tree map
        TreeMap<Integer, ArrayList<Integer>> map=new TreeMap<>();
        Queue<Map.Entry<Node, Integer>> queue=new LinkedList<>();
        queue.offer(new AbstractMap.SimpleEntry<>(root, 0));
        while(!queue.isEmpty()){
            Map.Entry<Node, Integer> entry =queue.poll();
            
            Node curr=entry.getKey(); //current node is 1
            int hd=entry.getValue();//hd is 0
            
            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(curr.data); //{0:[1]}
            
            if(curr.left!=null){
                queue.offer(new AbstractMap.SimpleEntry<>(curr.left, hd-1));
            }
            if(curr.right!=null){
                queue.offer(new AbstractMap.SimpleEntry<>(curr.right, hd+1));
            }
            
        }
        for(ArrayList<Integer> level: map.values()){
            result.add(level);
        }
        return result;
    }
}