#User function Template for python3

class Solution:
    def leftRotate(self, arr, d):
        # code here
        n=len(arr)
        temp=arr[0:d]
        for i in range(d,n):
            arr[i-d]=arr[i]
        arr[n-d:]=temp
        return arr
            