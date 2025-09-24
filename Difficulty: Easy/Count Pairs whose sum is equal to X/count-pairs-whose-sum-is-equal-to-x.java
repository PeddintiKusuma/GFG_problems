// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    // Function to count pairs in two linked lists whose sum is equal to x
    public int countPairs(Node head1, Node head2, int x) {
        // add your code here
        HashSet<Integer> hs1=new HashSet<>();
        int count=0;
        while(head2!=null){
            hs1.add(head2.data);
            head2=head2.next;
        }
        
        while(head1!=null){
            if(hs1.contains(x-head1.data)){
                count++;
            }
            head1=head1.next;
            
        }
        return count;
    }
}