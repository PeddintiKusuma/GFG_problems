class Solution:
    def getMinMax(self, arr):
        # code here
        min=arr[0]
        max=arr[0]
        i=0
        n=len(arr)
        for i in range(1,n):
            if arr[i]<min:
                min=arr[i]
            if arr[i]>max:
                max=arr[i]
            i=i+1
        
        return [min,max]