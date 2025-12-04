class Solution {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int n=arr.length;
        k=k%n;
        int[] temp= new int[n];
        for(int i=0;i<k;i++){
            temp[i]=arr[n-k+i];
        }
        for(int i=0;i<n-k;i++){
            temp[k+i]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}