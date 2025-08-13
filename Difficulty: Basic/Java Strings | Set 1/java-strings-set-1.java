// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String concat=S1+""+S2;
        char[] arr=concat.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
        
    }
}