// User function Template for Java
class Solution {
    String reverseWithSpacesIntact(String S) {
        // your code here
        char[] arr=S.toCharArray();
        int left=0;
        int right=arr.length-1;
        char temp;
        while(left<right){
            if(arr[left]==' '){
                left++;
                continue;
            }
            if(arr[right]==' '){
                right--;
                continue;
            }
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}