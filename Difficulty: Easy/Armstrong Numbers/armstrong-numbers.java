// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int s=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            sum=sum+(int)Math.pow(digit,3);
        }
        if(sum==s){
            return true;
        }
        return false;
    }
}