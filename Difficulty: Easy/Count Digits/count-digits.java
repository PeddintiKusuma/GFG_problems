class Solution {
    public int countDigits(int n) {
        // code here
        int count=0;
        while(n>0){
            int digit=n%10;
            n/=10;
            count++;
        }
        return count;
    }
}
