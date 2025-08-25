/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    static ArrayList<Integer> topView(Node root){
		ArrayList<Integer> result = new ArrayList<>();
		if(root==null)
			return result;
		//create a TreeMap to store the hd value and root value 
		TreeMap<Integer, Integer> map=new TreeMap<>();
		//queue
		Queue<NodewithHD> queue =new LinkedList<>();
		//add root node to the queue
		
		queue.offer(new NodewithHD(root,0));
		
		while(!queue.isEmpty()){
			NodewithHD current =queue.poll();
			
			Node node= current.node;
			int hd= current.hd;
			if(!map.containsKey(hd)){
				map.put(hd,node.data);
			}
			if(node.left!=null)
				queue.offer(new NodewithHD(node.left, hd-1));
			if(node.right!=null)
				queue.offer(new NodewithHD(node.right, hd+1));
		}
		
		for(int val:map.values()){
			result.add(val);
		}
		return result;
	
	}
	static class NodewithHD{
		Node node;
		int hd;
		NodewithHD(Node node, int val){
			this.node=node;
			this.hd=val;
		}
	}
}
