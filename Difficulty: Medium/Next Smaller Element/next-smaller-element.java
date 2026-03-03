class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res.add(-1);
            }
            else{
                res.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        Collections.reverse(res);
        return res;
    }
}