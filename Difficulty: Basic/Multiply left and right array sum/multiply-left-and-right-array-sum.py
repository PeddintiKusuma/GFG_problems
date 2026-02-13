#User function Template for python3

class Solution:
    def multiply(self, arr):
        # Code here
        n=len(arr)
        half=len(arr)//2
        sum1=0
        sum2=0
        for i in range(0,half):
            sum1=sum1+arr[i]
        for i in range(half,n):
            sum2=sum2+arr[i]
        return sum1*sum2
            