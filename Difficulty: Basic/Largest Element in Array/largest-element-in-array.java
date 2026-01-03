class Solution {
    public static int largest(int[] arr) {
        // code here
        // int max=Arrays.stream(arr).max().getAsInt();
        // return max;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
