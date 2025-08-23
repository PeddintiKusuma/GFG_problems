class Solution {
    public static void printPrimeFactorization(int n) {
        // code here
        for(int i=2;i<n;i++){
            while(n%i==0){
                n=n/i;
                System.out.print(i+" ");
            }
        }
        if(n>1){
            System.out.print(n);
        }
    }
}
