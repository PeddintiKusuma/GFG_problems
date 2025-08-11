class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here

int res=-1;
int left=0;
        int right=arr.length-1;
        while(left<=right){
        int mid=left+(right-left)/2;
        if(arr[mid]==k)   {
             res= mid;
            right=mid-1;
        } 
        else if(arr[mid]<k){
            left=mid+1;
        }
        else if(arr[mid]>k){
            right=mid-1;
        }
         
        }
        return res;
    }
}