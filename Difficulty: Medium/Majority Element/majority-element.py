class Solution:
    def majorityElement(self, arr):
        n = len(arr)
        freq = {}

        for x in arr:
            if x in freq:
                freq[x] += 1
            else:
                freq[x] = 1

            if freq[x] > n // 2:
                return x

        return -1
        
