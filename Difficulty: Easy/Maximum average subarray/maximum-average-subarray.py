#User function Template for python3

class Solution:
    def findMaxAverage(self, arr, n, k):
        # code here
        window_sum=sum(arr[:k])
        max_val=window_sum
        max_index=0
        for i in range(k,len(arr)):
            window_sum=window_sum-arr[i-k]+arr[i]
            if window_sum>max_val:
                max_val=window_sum
                max_index=i-k+1
        return max_index
                