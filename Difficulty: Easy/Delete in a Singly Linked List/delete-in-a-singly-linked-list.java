/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
       if(x==1) {
           head=head.next; 
           return head;
       }
       Node curr= head;
       for(int i=1;i<x-1;i++){
           curr=curr.next;
           
       }
       if(curr!=null &curr.next!=null){
       curr.next=curr.next.next;
       }
       return head;
    }
}