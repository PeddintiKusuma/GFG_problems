class Solution:
    def getSecondLargest(self, arr):
        # Code Here
        l=-1
        s=-1
        
     
        
        for i in arr:
            if i>l :
                s=l
                l=i
            elif i>s and i<l:
                s=i
        return s