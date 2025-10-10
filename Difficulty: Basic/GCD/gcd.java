// User function Template for Java
class Solution {
    public static int gcd(int a, int b) {

        // code here to calculate and return gcd of a and b
        a=Math.abs(a);
        b=Math.abs(b);
        
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
            
        }
        return a;
    }
}