#User function Template for python3
class Solution:
    def getMoreAndLess(self, arr, target):
		# code here
		s=0
        l=0
        for num in arr:
            if num<=target:
                s=s+1
            if num>=target:
                l=l+1
        return [s,l]