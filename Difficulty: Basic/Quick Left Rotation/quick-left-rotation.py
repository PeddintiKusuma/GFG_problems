class Solution:
    def leftRotate(self, arr, k):
        # Your code goes here
        n=len(arr)
        k=k%n
        arr[:]=arr[k:]+arr[:k]
        return arr
            