// User function Template for Java
class Solution {
    public static int nFactorial(int n) {
        int ans = 1;

        // Write your code here
        for(int i=n;i>0;i--){
            ans=ans*i;
        }

        return ans;
    }
}