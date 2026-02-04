
// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime numbe
       
        int ans = 0;
        for(int i = n+1; i<=550; i++){
             int count = 0;
            for(int j = 1 ; j<=550; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
                ans = i;
                break;
            }
        }
        return ans;
    }
}