class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        int fact=1;
        int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        return fact;
    }
}
