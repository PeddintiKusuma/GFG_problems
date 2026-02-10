class Solution:
    def valueEqualToIndex(self, arr):
        list=[]
        i=0
        n=len(arr)
        while i<n:
            if i+1==arr[i]:
                list.append(arr[i])
            i=i+1
        return list
        