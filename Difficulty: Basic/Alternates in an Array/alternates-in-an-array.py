class Solution:
    def getAlternates(self, arr):
        # Code Here
        lis=[]
        n=len(arr)
        for i in range(0,n):
            if i%2==0:
                lis.append(arr[i])
        return lis
            