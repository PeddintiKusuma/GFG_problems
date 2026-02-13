#User function Template for python3

class Solution:
    def firstIndex(self, arr):
    # Your code goes here
        n=len(arr)
        for i in range(n):
            if arr[i]==1:
                return i
        return -1

