
class Solution:
    def swapKth(self, arr, k):
        # Code Here
        a=k-1
        b=-k
        arr[a],arr[b]=arr[b],arr[a]
