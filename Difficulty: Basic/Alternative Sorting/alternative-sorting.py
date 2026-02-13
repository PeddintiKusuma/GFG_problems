class Solution:
    def alternateSort(self,arr):
        # Your code goes here
        n=len(arr)
        arr2=[]
        left=0
        right=n-1
        arr.sort()
        while left<=right:
            if left!=right:
                arr2.append(arr[right])
                arr2.append(arr[left])
            else:
                arr2.append(arr[left])
            right=right-1
            left=left+1
        return arr2