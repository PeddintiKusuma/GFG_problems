class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> stack= new Stack<>();
        ArrayList<Integer> span= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty()&& arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span.add(i+1);
            }
            else{
                span.add(i-stack.peek());
            }
            stack.push(i);
        }
        return span;
        
    }
}