// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
     int min=Integer.MAX_VALUE;
     int mprofit=0;
     for(int i=0;i<prices.length;i++){
         min=Math.min(min,prices[i]);
         mprofit=Math.max(mprofit,prices[i]-min);
     }
     return mprofit;
    }
}