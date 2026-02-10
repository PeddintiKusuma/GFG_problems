#User function Template for python3

class Solution:
    def rotate(self, arr):
        n=len(arr)-1
        temp=arr[n]
        i=n
        while i>0:
            arr[i]=arr[i-1]
            i=i-1
            
        arr[0]=temp
        return arr
