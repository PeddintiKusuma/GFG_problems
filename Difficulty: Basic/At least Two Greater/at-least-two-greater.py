#User function Template for python3

class Solution:
    def findElements(self,arr):
        # Your code goes here
        arr.sort()
        lst=[]
        for num in range(0,len(arr)-2):
            lst.append(arr[num])
        return lst