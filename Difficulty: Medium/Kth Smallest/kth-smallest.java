// User function Template for Java
import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue <Integer> minHeap= new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num:arr){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
