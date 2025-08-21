// User function Template for Java
class Solution {
    static int repeatedSumOfDigits(int N) {
        // code here
        if(N==0){
            return 0;
        }
        return 1+(N-1)%9;
    }
}
