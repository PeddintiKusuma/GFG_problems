/*node class of the linked list
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
    public int GetNth(Node head, int index) {
        // Code here
        int count=0;
        Node cur=head;
        while(cur!=null){
            count++;
            if(count==index){
                return cur.data;
            }
            cur=cur.next;
        }
        return -1;
    }
}