// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
        
    }
    private int helper(int n,int digits){
        if(n==0) return 0;
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10, digits-1);
    }
}